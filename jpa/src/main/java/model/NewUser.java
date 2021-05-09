package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NewUser {
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        User newUser = new User("Matheus", "Matheus@mail.com");
        em.persist(newUser);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
