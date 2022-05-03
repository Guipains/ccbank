/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UsuarioDao;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class UsuarioService {
    private UsuarioDao usuarioDao;
    
    public UsuarioService() {
        usuarioDao = new UsuarioDao();
    }
    
    public void inserir(Usuario usuario){
        usuarioDao.insert(usuario);
    }
    public void atualizar(Usuario usuario){
        usuarioDao.update(usuario);
    }
    public void excluir(Usuario usuario){
        usuarioDao.delete(usuario);
    }
    public List<Usuario> listartodososusuarios(){
        return usuarioDao.findAll();
    }
}
