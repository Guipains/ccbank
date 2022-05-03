/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.PessoaDao;
import domain.Pessoa;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class PessoaService {
    private PessoaDao pessoaDao;
    
    public PessoaService() {
        pessoaDao = new PessoaDao();
    }
    
    public void inserir(Pessoa pessoa){
        pessoaDao.insert(pessoa);
    }
    public void atualizar(Pessoa pessoa){
        pessoaDao.update(pessoa);
    }
    public void excluir(Pessoa pessoa){
        pessoaDao.delete(pessoa);
    }
    public List<Pessoa> listartodasaspessoas(){
        return pessoaDao.findAll();
    }
}
