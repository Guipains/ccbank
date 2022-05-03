/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Historico;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.HistoricoService;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "historicoMB")
@RequestScoped
public class HistoricoController implements Serializable {
    
    private Historico historico;
    private HistoricoService historicoService;
    

    public HistoricoController() {
        this.historico = new Historico();
        this.historicoService = new HistoricoService();
    }
    
    public String inserirOuAtualizar(){
        if((historico.getId() == null)){
            historicoService.inserir(historico);
        }else{
            historicoService.atualizar(historico);
        }
        return "listar.xhtml";
    }
     public String novo(){
        historico = new Historico();
        return "novo.xhtml";
    }
    
    public String editar(Historico historico){
        this.historico = historico;
        
        return "novo.xhtml";
    }
    
    public String excluir(Historico historico){
        this.historico = historico;
        historicoService.excluir(historico);
        
        return "listar.xhtml";
    }
    
    public List<Historico> getTodosOsHistoricos(){
        return historicoService.listartodososhistorios();
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }
}
