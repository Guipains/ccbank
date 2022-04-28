/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Conta;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import service.ContaService;

@ManagedBean(name = "contaMB")
@SessionScoped
public class ContaController {
    ContaService contaService;
    private Conta conta;
    private String nomePessoa="";

    public ContaController() {
        conta = new Conta();
        contaService = new ContaService();
    }
    
    public String inserirOuAtualizar(){
        if((conta.getId() == null)){
            contaService.inserir(conta);
        }else{
            contaService.atualizar(conta);
        }
        
        return "listar.xhtml";
    }
    
    public String novo(){
        conta = new Conta();
        return "novo.xhtml";
    }
    
    public String editar(Conta conta){
        this.conta = conta;
        
        return "novo.xhtml";
    }
    
    public String excluir(Conta conta){
        this.conta = conta;
        contaService.excluir(conta);
        
        return "listar.xhtml";
    }
    
    public List<Conta> getTodasAsContas(){
        return contaService.listartodasacontas();
    }
    
    public void pessoaNome(String nome){
        //Arrumar.
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public Conta getConta() {
        return conta;
    }
    
    public void setConta(Conta conta) {
        this.conta = conta;
    }  
}
