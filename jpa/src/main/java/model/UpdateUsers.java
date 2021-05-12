package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateUsers {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        User user = em.find(User.class, 1L);
        user.setName("Jose");
        user.setEmail("jose@mail.com");
        em.merge(user);
        em.getTransaction().commit();
        System.out.println(user.getName());
        em.close();
        emf.close();
    }
}
