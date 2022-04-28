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
import javax.faces.bean.SessionScoped;
import service.CidadeService;

@ManagedBean(name = "cidadeMB")
@SessionScoped
public class CidadeController implements Serializable {
    private CidadeService cidadeService;
    private Cidade cidade;

    public CidadeController() {
        cidade = new Cidade();
        cidadeService = new CidadeService();
    }
    
    public String inserirOuAtualizar(){
        if((cidade.getId() == null)){
            cidadeService.inserir(cidade);
        }else{
            cidadeService.atualizar(cidade);
        }
        return "listar.xhtml";
    }
    
    public String novo(){
        cidade = new Cidade();
        return "novo.xhtml";
    }
    
    public String editar(Cidade cidade){
        this.cidade = cidade;
        
        return "novo.xhtml";
    }
    
    public String excluir(Cidade cidade){
        this.cidade = cidade;
        cidadeService.excluir(cidade);
        
        return "listar.xhtml";
    }
    
    public List<Cidade> getTodasAsCidades(){
        return cidadeService.listartodasascidades();
    }

     public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }  
}
