/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDao;
import domain.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "UsuarioMB")
@RequestScoped
public class UsuarioController {
    private Usuario usuario;
    private final UsuarioDao usuarioDao;
    

    public UsuarioController() {
        this.usuarioDao = new UsuarioDao();
    }
    
    public String inserir(){
        usuarioDao.insert(usuario);
        return "index.xhtml";
    }

    public Usuario getCidade() {
        return usuario;
    }
}
