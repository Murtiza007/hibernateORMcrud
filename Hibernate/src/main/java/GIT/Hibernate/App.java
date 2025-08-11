package GIT.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import GIT.Hibernate.entity.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Student std=new Student();
        std.setId(104);
        std.setName("musa");
        std.setEmail("momin@");
        std.setBatch("java");
        
        Configuration cfg = new Configuration();
        cfg.configure("configuration/hibernate.cfg.xml"); 

       
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(std);
        transaction.commit();

  
        session.close();
        sessionFactory.close();
    }
}
