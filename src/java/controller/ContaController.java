/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ContaDao;
import domain.Conta;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "contaMB")
@SessionScoped
public class ContaController {
   private Conta conta;
    private final ContaDao contaDao;
    

    public ContaController() {
        this.contaDao = new ContaDao();
    }
    
    public String inserir(){
        contaDao.insert(conta);
        return "index.xhtml";
    }

    public Conta getCidade() {
        return conta;
    } 
}
