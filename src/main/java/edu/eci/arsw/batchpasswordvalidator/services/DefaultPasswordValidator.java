/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.services;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author hcadavid
 */
public class DefaultPasswordValidator {
    
    public boolean validatePassword(String password){
        if (password.length()<20){            
            return !StringUtils.containsAny(password, "!@#$%ˆ*()-+");
        }
        else{
            return false;
        }
    }    

}
