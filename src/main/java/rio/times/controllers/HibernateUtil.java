package rio.times.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import java.util.logging.Level;

public class HibernateUtil {
    public static Session getSessionFactory(){
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        StandardServiceRegistry standardServiceRegistry =
                new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        return session;
    }
}
