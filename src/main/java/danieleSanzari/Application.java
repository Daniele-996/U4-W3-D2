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

        Evento festa1 = new Evento("festa compleanno", LocalDate.now(), "festa compleanno", TipoEvento.PUBBLICO, 15);
        Evento festa2 = new Evento("festa per bambini", LocalDate.now(), "festa per bambini", TipoEvento.PUBBLICO, 200);
        Evento festa3 = new Evento("festa per adulti", LocalDate.now(), "festa per adulti", TipoEvento.PRIVATO, 25);
        Evento festa4 = new Evento("festa per ragazzi", LocalDate.now(), "festa per ragazzi", TipoEvento.PUBBLICO, 100);
        Evento festa5 = new Evento("festa per anziani", LocalDate.now(), "festa per anziani", TipoEvento.PRIVATO, 60);
        Evento festa6 = new Evento("festa per dipendenti", LocalDate.now(), "festi per dipendenti", TipoEvento.PRIVATO, 250);
        Evento festa7 = new Evento("festa per dipendenti", LocalDate.now(), "festi per dipendenti", TipoEvento.PRIVATO, 250);

        ed.save(festa1);
        ed.save(festa2);
        ed.save(festa3);
        ed.save(festa4);
        ed.save(festa5);
        ed.save(festa6);
        ed.save(festa7);

        emf.close();
        em.close();
    }
}
