package repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.StudentEntity;
import util.SessionFactoryConfiguartion;

public class StudentRepository {
    
    Session session = SessionFactoryConfiguartion.getInstance().getSession();

    public Integer saveStudent(StudentEntity studentEntity){
        Transaction transaction = session.beginTransaction();
        try {
            Integer id = (Integer)session.save(studentEntity);
            transaction.commit();
            return id;
        } catch (Exception e) {
            transaction.rollback();
            return - 1;
        }
    }

}
