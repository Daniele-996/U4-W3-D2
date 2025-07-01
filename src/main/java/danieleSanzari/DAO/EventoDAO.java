package danieleSanzari.DAO;

import danieleSanzari.entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private EntityManager entityManager;

    public EventoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Evento newEvento) {
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(newEvento);

        transaction.commit();

        System.out.println("L'evento " + newEvento.getTitolo() + " è stato correttamente salvato nel database");
    }

    public void findById(long eventoId){
        Evento foundById = entityManager.find()
    }
}
