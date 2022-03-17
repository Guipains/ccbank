/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.HistoricoDao;
import domain.Historico;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "historicoMB")
@RequestScoped
public class HistoricoController implements Serializable {
    
    private Historico historico;
    private final HistoricoDao historicoDao;
    

    public HistoricoController() {
        this.historicoDao = new HistoricoDao();
    }
    
    public String inserir(){
        historicoDao.insert(historico);
        return "index.xhtml";
    }

    public Historico getCidade() {
        return historico;
    }
}
