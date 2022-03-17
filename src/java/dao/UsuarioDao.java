/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Usuario;
import java.util.List;
import org.hibernate.Session;
import utils.HibernateUtil;

/**
 *
 * @author Aluno
 */
public class UsuarioDao {
    Session session = HibernateUtil.getSessionFactory().openSession();

    public List<Usuario> findAll(){
        session.beginTransaction();
        try{
            List<Usuario> usuarios = session.createQuery("from Cidade order by nome").list();
            session.getTransaction().commit();
            return usuarios;
        }catch(Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    public Usuario findById(Integer id){
        session.beginTransaction();
        try{
            Usuario usuario = (Usuario)session.createQuery("from Cidade where id = " + id).uniqueResult();
            session.getTransaction().commit();
            return usuario;
        }catch(Exception e){
            session.getTransaction().rollback();
            return null;
        }
    }

    public boolean insert(Usuario usuario){
        session.beginTransaction();
        try{
            session.save(usuario);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }

    public boolean update(Usuario usuario){
        session.beginTransaction();
        try{
            session.update(usuario);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }

    public boolean delete(Usuario usuario){
        session.beginTransaction();
        try{
            session.delete(usuario);
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            session.getTransaction().rollback();
            return false;
        }
    }
}
