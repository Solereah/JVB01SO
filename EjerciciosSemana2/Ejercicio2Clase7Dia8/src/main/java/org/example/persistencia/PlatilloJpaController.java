package org.example.persistencia;
import org.example.logica.Platillo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


public class PlatilloJpaController {
    private EntityManagerFactory emf = null;

    //Obtener la unidad de persistencia
        this.emf = Persistence.createEntityManagerFactory("restaurantePU");

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    //Métodos para interactuar con la DB

    //Método para crear un platillo
    public void create(Platillo platillo){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(platillo);
        em.getTransaction().commit();
    }

    public void destroy(int id){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        Platillo platillo = em.find(Platillo.class, id);
        em.remove(platillo);
        em.getTransaction().commit();

    }

    public void editarPlatillo(Platillo platillo) throws Exception{
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.merge(platillo);
        em.getTransaction().commit();

    }

    public List<Platillo> findPlatillosEntities(){
        EntityManager em = null;
        em = getEntityManager();

        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Platillo.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }
}
