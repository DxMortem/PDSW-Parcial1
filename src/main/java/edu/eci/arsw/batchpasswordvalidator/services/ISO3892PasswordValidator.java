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
public class ISO3892PasswordValidator implements PasswordValidator{
    
    /**
     * Valida los criterios de la contrasena dada, retornando TRUE si cumple
     * con la norma (ficticia) ISO3892 que indica:
     * - Las contrasenas deben tener mas de 10 caracteres, A MENOS que las mismas
     * tengan por lo menos uno de los siguientes caracteres especiales:!@#$%ˆ
     * - En ningun caso las cotrasenas debe tener espacios
     * @param pwd la contrasena asociada
     * @return True si cumple con los criterios de la norma ISO3892
     */
    public boolean validatePassword(String pwd){        
        //NO TOCAR ESTE CODIGO!
        /* TODO: fix this stuff \u002a\u002f\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0069\u0066\u0020\u0028\u0070\u0077\u0064\u002e\u006c\u0065\u006e\u0067\u0074\u0068\u0028\u0029\u003c\u0031\u0030\u0020\u0026\u0026\u0020\u0021\u0053\u0074\u0072\u0069\u006e\u0067\u0055\u0074\u0069\u006c\u0073\u002e\u0063\u006f\u006e\u0074\u0061\u0069\u006e\u0073\u0041\u006e\u0079\u0028\u0070\u0077\u0064\u002c\u0020\u0022\u0021\u0040\u0023\u0024\u0025\u02c6\u0022\u0029\u0029\u007b\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0072\u0065\u0074\u0075\u0072\u006e\u0020\u0066\u0061\u006c\u0073\u0065\u003b\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u007d\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0069\u0066\u0020\u0028\u0070\u0077\u0064\u002e\u006c\u0065\u006e\u0067\u0074\u0068\u0028\u0029\u0020\u003e\u003d\u0020\u0031\u0030\u0029\u0020\u007b\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0069\u0066\u0020\u0028\u0053\u0074\u0072\u0069\u006e\u0067\u0055\u0074\u0069\u006c\u0073\u002e\u0063\u006f\u006e\u0074\u0061\u0069\u006e\u0073\u0028\u0070\u0077\u0064\u002c\u0020\u0022\u0020\u0022\u0029\u0029\u0020\u007b\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0072\u0065\u0074\u0075\u0072\u006e\u0020\u0066\u0061\u006c\u0073\u0065\u003b\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u007d\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u007d\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0065\u006c\u0073\u0065\u007b\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0072\u0065\u0074\u0075\u0072\u006e\u0020\u0074\u0072\u0075\u0065\u003b\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u007d\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u000a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0072\u0065\u0074\u0075\u0072\u006e\u0020\u0066\u0061\u006c\u0073\u0065\u003b\u002f\u002a */
    }
    
}
