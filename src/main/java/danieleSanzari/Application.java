package danieleSanzari;

import danieleSanzari.DAO.EventoDAO;
import danieleSanzari.entities.Evento;
import danieleSanzari.entities.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4-w3-d2");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);

        Evento festa2 = new Evento("festa adulti", LocalDate.now(), "festi per adulti", TipoEvento.PUBBLICO, 150);
        Evento festa1 = new Evento("festa bambini", LocalDate.now(), "festi per bambini", TipoEvento.PUBBLICO, 50);

        ed.save(festa1);
        ed.save(festa2);

        emf.close();
        em.close();
    }
}
