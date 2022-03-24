 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Cidade;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.CidadeService;

@ManagedBean(name = "cidadeMB")
@RequestScoped
public class CidadeController implements Serializable {
    private CidadeService cidadeService;
    private Cidade cidade;

    public CidadeController() {
        cidadeService = new CidadeService();
        cidade = new Cidade();
    }
    
    public String novo(){
        return "novo.xhtml";
    }
    
    public String inserir(){
        cidadeService.inserir(cidade);
        return "listar.xhtml";
    }
    
    public List<Cidade> gettodasascidades(){
        return null;
    }

     public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
}
