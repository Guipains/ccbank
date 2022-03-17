/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Pessoa;
import java.util.List;
import org.hibernate.Session;
import utils.HibernateUtil;

/**
 *
 * @author Aluno
 */
public class PessoaDao {
    
    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<Pessoa> findAll(){
        session.beginTransaction();
        try{
            List<Pessoa> pessoas = session.createQuery("from Cidade order by nome").list();
            session.getTransaction().commit();
            return pessoas;
        }catch(Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    public Pessoa findById(Integer id){
        session.beginTransaction();
        try{
            Pessoa pessoa = (Pessoa)session.createQuery("from Cidade where id = " + id).uniqueResult();
            session.getTransaction().commit();
            return pessoa;
        }catch(Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    public boolean insert(Pessoa pessoa){
        session.beginTransaction();
        try{
            session.save(pessoa);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }

    public boolean update(Pessoa pessoa){
        session.beginTransaction();
        try{
            session.update(pessoa);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }

    public boolean delete(Pessoa pessoa){
        session.beginTransaction();
        try{
            session.delete(pessoa);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }
}
