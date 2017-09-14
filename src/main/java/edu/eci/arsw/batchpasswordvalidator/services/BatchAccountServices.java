/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.services;

import edu.eci.arsw.batchpasswordvalidator.model.AccountRequest;
import java.util.List;

/**
 *
 * @author 2103110
 */
public interface BatchAccountServices {
    
    List createAccounts(List<AccountRequest> requests);
    
}
