package infrastructure;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E>{
   private static EntityManagerFactory emf;
   private EntityManager em;
   private Class<E> entityClass;   
   static{
       try {
           emf = Persistence.createEntityManagerFactory("jpa");
       } catch (Exception e) {
           System.out.println(e);
       }
   }

   public DAO(){
       this(null);
   }

   public DAO(Class<E> entityClass){
       this.entityClass = entityClass;
       em = emf.createEntityManager();
   }

   public DAO<E> openTransaction(){
        em.getTransaction().begin();   
        return this;
   }

   public DAO<E> closeTransaction(){
        em.getTransaction().commit();   
        return this;
    }

    public DAO<E> include(E entity){
        em.persist(entity); 
        return this;
    }

    public DAO<E> includeAtomic (E entity){
        
        return this.openTransaction().include(entity).closeTransaction();
    }


    public List<E> getAll(){
        if(this.entityClass == null){
            throw new UnsupportedOperationException("Null Class");
        }
        String jpql = "select e from " + entityClass.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, entityClass);
        query.setMaxResults(10);
        return query.getResultList();
    }

    public List<E> getAll(int qnt, int offset){
        if(this.entityClass == null){
            throw new UnsupportedOperationException("Null Class");
        }

        String jpql = "select e from " + entityClass.getName() + " e";
        TypedQuery<E> query = em.createQuery(jpql, entityClass);
        query.setMaxResults(qnt);
        query.setFirstResult(offset);
        return query.getResultList();
    }

    public void close(){
        this.em.close();
    }
}
