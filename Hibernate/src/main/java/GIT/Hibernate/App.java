package GIT.Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import GIT.Hibernate.entity.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Student std=new Student();
        
        //insert to hibernate
        
//        std.setId(103);
//        std.setName("basim");
//        std.setEmail("momin@");
//        std.setBatch("java");
//        
        Configuration cfg = new Configuration();
       cfg.configure("configuration/hibernate.cfg.xml"); 

    
      SessionFactory sessionFactory = cfg.buildSessionFactory();
       Session session = sessionFactory.openSession();
      Transaction transaction = session.beginTransaction();
//
//        session.save(std);
//        transaction.commit();
//
//  
//        session.close();
//        sessionFactory.close();
//        
      
      	//retrieve
//        Student std=session.get(Student.class, 102);
//        
//        System.out.println(std.getName());
//        System.out.println(std.getBatch());
//        System.out.println(std.getEmail());
//        
       //update
//      Student std=session.get(Student.class, 101);
//      std.setBatch("spring");
//      session.saveOrUpdate(std);
//      transaction.commit();
//      System.out.println("work done");
//    
      //delete
      //Student std=session.get(Student.class, 101);
      
//      Student std =new Student();
//      std.setId(102);
//      session.delete(std);
//      transaction.commit();
//      System.out.println("work done");

      
      //display all
      
      Query<Student> query = session.createQuery("FROM Student", Student.class);
      List<Student> students = query.list();

      for (Student s : students) {
          System.out.println(s.getId() + " - " + s.getName()+" - "+s.getBatch());
      }

      transaction.commit();
      session.close();
        
        
    }
}
