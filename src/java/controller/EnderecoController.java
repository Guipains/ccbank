/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EnderecoDao;
import domain.Endereco;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "enderecoMB")
@RequestScoped
public class EnderecoController implements Serializable{
    private Endereco endereco;
    private final EnderecoDao enderecoDao;
    

    public EnderecoController() {
        this.enderecoDao = new EnderecoDao();
    }
    
    public String inserir(){
        enderecoDao.insert(endereco);
        return "index.xhtml";
    }

    public Endereco getCidade() {
        return endereco;
    }
}
