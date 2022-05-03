/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import domain.Endereco;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.EnderecoService;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "enderecoMB")
@RequestScoped
public class EnderecoController implements Serializable{
    
    private Endereco endereco;
    private EnderecoService enderecoService;
    

    public EnderecoController() {
        this.endereco = new Endereco();
        this.enderecoService = new EnderecoService();
    }
    
    public String inserirOuAtualizar(){
        if((endereco.getId() == null)){
            enderecoService.inserir(endereco);
        }else{
            enderecoService.atualizar(endereco);
        }
        return "listar.xhtml";
    }
    
    public String novo(){
        endereco = new Endereco();
        return "novo.xhtml";
    }
    
    public String editar(Endereco endereco){
        this.endereco = endereco;
        
        return "novo.xhtml";
    }
    
    public String excluir(Endereco endereco){
        this.endereco = endereco;
        enderecoService.excluir(endereco);
        
        return "listar.xhtml";
    }
    
    public List<Endereco> getTodasAsContas(){
        return enderecoService.listartodososenderecos();
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
