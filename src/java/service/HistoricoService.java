/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.HistoricoDao;
import domain.Historico;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class HistoricoService {
    private HistoricoDao historicoDao;
    
    public HistoricoService() {
        historicoDao = new HistoricoDao();
    }
    
    public void inserir(Historico historico){
        historicoDao.insert(historico);
    }
    public void atualizar(Historico historico){
        historicoDao.update(historico);
    }
    public void excluir(Historico historico){
        historicoDao.delete(historico);
    }
    public List<Historico> listartodososhistorios(){
        return historicoDao.findAll();
    }
}
