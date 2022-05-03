/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Pessoa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import service.PessoaService;

/**
 *
 * @author Aluno
 */
@ManagedBean(name = "pessoaMB")
@RequestScoped
public class PessoaController {
    
    private Pessoa pessoa;
    private PessoaService pessoaService;
    

    public PessoaController() {
        this.pessoa = new Pessoa();
        this.pessoaService = new PessoaService();
    }
    
    public String inserirOuAtualizar(){
        if((pessoa.getId() == null)){
            pessoaService.inserir(pessoa);
        }else{
            pessoaService.atualizar(pessoa);
        }
        return "listar.xhtml";
    }
     public String novo(){
        pessoa = new Pessoa();
        return "novo.xhtml";
    }
    
    public String editar(Pessoa historico){
        this.pessoa = historico;
        
        return "novo.xhtml";
    }
    
    public String excluir(Pessoa historico){
        this.pessoa = historico;
        pessoaService.excluir(historico);
        
        return "listar.xhtml";
    }
    
    public List<Pessoa> getTodosAsPessoas(){
        return pessoaService.listartodasaspessoas();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
