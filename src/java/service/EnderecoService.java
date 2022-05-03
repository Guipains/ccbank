/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.EnderecoDao;
import domain.Endereco;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class EnderecoService {
    private EnderecoDao enderecoDao;
    
    public EnderecoService() {
        enderecoDao = new EnderecoDao();
    }
    
    public void inserir(Endereco endereco){
        enderecoDao.insert(endereco);
    }
    public void atualizar(Endereco endereco){
        enderecoDao.update(endereco);
    }
    public void excluir(Endereco endereco){
        enderecoDao.delete(endereco);
    }
    public List<Endereco> listartodososenderecos(){
        return enderecoDao.findAll();
    }
}
