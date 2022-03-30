/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.CidadeDao;
import domain.Cidade;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class CidadeService {

    private CidadeDao cidadeDao;
    
    public CidadeService() {
        cidadeDao = new CidadeDao();
    }
    
    public void inserir(Cidade cidade){
        cidadeDao.insert(cidade);
    }
    public void atualizar(Cidade cidade){
        cidadeDao.update(cidade);
    }
    public void excluir(Cidade cidade){
        cidadeDao.delete(cidade);
    }
    public List<Cidade> listartodasascidades(){
        return cidadeDao.findAll();
    }
}
