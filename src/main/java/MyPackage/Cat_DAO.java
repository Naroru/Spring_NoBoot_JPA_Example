package MyPackage;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

//import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("catDAO")

public class Cat_DAO {

    private final EntityManagerFactory entityManagerFactory;

    public Cat_DAO(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }


    public void save(Cat_Entity cat)
    {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // entityManager.getTransaction().begin(); //управление транзакцией берет аннотация  @Transactional в Сервисе

        entityManager.persist(cat);

        entityManager.flush();
   /*     if (entityManager.getTransaction().isActive())
            entityManager.getTransaction().commit();*/
    }
}
