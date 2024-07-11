package rio.times.repositories;

import org.hibernate.Session;
import org.hibernate.query.Query;
import rio.times.controllers.HibernateUtil;

import java.util.List;

public class TimesHelper {
    Session session = null;

    public TimesHelper(){
        session = HibernateUtil.getSessionFactory();
        session.beginTransaction();
    }

    public List getTimes(){
        List<Times> timesList = null;
        try{
            Query q = session.createQuery("from Times as timesRio", Times.class);
            timesList = (List<Times>) q.list();
            session.clear();
            session.close();
            session.getSessionFactory().close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return timesList;
    }

    public int inserir(Times time){
        int quantidadeCadastros = (Integer) session.save(time);
        session.getTransaction().commit();
        return quantidadeCadastros;
    }

}
