/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PessoaDao;
import domain.Pessoa;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "pessoaMB")
@RequestScoped
public class PessoaController {
    
    private Pessoa pessoa;
    private final PessoaDao pessoaDao;
    

    public PessoaController() {
        this.pessoaDao = new PessoaDao();
    }
    
    public String inserir(){
        pessoaDao.insert(pessoa);
        return "index.xhtml";
    }

    public Pessoa getCidade() {
        return pessoa;
    }
}
