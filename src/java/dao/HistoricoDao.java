/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Historico;
import java.util.List;
import org.hibernate.Session;
import utils.HibernateUtil;

/**
 *
 * @author Aluno
 */
public class HistoricoDao {
    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<Historico> findAll(){
        session.beginTransaction();
        try{
            List<Historico> historicos = session.createQuery("from Cidade order by nome").list();
            session.getTransaction().commit();
            return historicos;
        }catch(Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    public Historico findById(Integer id){
        session.beginTransaction();
        try{
            Historico historico = (Historico)session.createQuery("from Cidade where id = " + id).uniqueResult();
            session.getTransaction().commit();
            return historico;
        }catch(Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    public boolean insert(Historico historico){
        session.beginTransaction();
        try{
            session.save(historico);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }

    public boolean update(Historico historico){
        session.beginTransaction();
        try{
            session.update(historico);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }

    public boolean delete(Historico historico){
        session.beginTransaction();
        try{
            session.delete(historico);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }
}
