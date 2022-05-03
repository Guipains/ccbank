/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDao;
import domain.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.UsuarioService;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "usuarioMB")
@RequestScoped
public class UsuarioController {
    private Usuario usuario;
    private UsuarioService usuarioService;
    

    public UsuarioController() {
        this.usuario = new Usuario();
        this.usuarioService = new UsuarioService();
    }
    
    public String inserirOuAtualizar(){
        if((usuario.getId() == null)){
            usuarioService.inserir(usuario);
        }else{
            usuarioService.atualizar(usuario);
        }
        return "listar.xhtml";
    }
     public String novo(){
        usuario = new Usuario();
        return "novo.xhtml";
    }
    
    public String editar(Usuario historico){
        this.usuario = historico;
        
        return "novo.xhtml";
    }
    
    public String excluir(Usuario historico){
        this.usuario = historico;
        usuarioService.excluir(historico);
        
        return "listar.xhtml";
    }
    
    public List<Usuario> getTodosOsUsuarios(){
        return usuarioService.listartodososusuarios();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
