/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CidadeDao;
import domain.Cidade;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CidadeController implements Serializable {
    
    private Cidade cidade;
    private final CidadeDao cidadeDao;
    

    public CidadeController() {
        this.cidadeDao = new CidadeDao();
    }
    
    public String inserir(){
        cidadeDao.insert(cidade);
        return "index.xhtml";
    }

    public Cidade getCidade() {
        return cidade;
    }
}
