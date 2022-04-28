/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ContaDao;
import domain.Conta;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ContaService {
    private ContaDao contaDao;
    
    public ContaService() {
        contaDao = new ContaDao();
    }
    
    public void inserir(Conta conta){
        contaDao.insert(conta);
    }
    public void atualizar(Conta conta){
        contaDao.update(conta);
    }
    public void excluir(Conta conta){
        contaDao.delete(conta);
    }
    public List<Conta> listartodasacontas(){
        return contaDao.findAll();
    }
}
