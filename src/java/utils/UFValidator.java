/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


/**
 *
 * @author Aluno
 */
@FacesValidator("UFvalidator")
public class UFValidator implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent component, Object value) throws ValidatorException {
        String valor = value.toString();
        String[] ufs = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
        boolean achou;
        int posicao = 0;

        do{
            achou = value.equals(ufs[posicao]);
            posicao++;
        }while((!achou) && (posicao < ufs.length));
        
        if(!achou){
            throw new ValidatorException(new FacesMessage("UF invalida"));
        }
    }   
}
