package dao;

import domain.Conta;
import java.util.List;
import org.hibernate.Session;
import utils.HibernateUtil;

public class ContaDao {
    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<Conta> findAll(){
        session.beginTransaction();
        try{
            List<Conta> contas = session.createQuery("from Cidade order by nome").list();
            session.getTransaction().commit();
            return contas;
        }catch(Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    public Conta findById(Integer id){
        session.beginTransaction();
        try{
            Conta conta = (Conta)session.createQuery("from Cidade where id = " + id).uniqueResult();
            session.getTransaction().commit();
            return conta;
        }catch(Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    public boolean insert(Conta conta){
        session.beginTransaction();
        try{
            session.save(conta);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }

    public boolean update(Conta conta){
        session.beginTransaction();
        try{
            session.update(conta);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }

    public boolean delete(Conta conta){
        session.beginTransaction();
        try{
            session.delete(conta);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }
}