/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.model;

/**
 *
 * @author hcadavid
 */
public class AccountRequest {
    
    private String userName;
    
    private String password;

    public AccountRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "AccountRequest{" + "userName=" + userName + ", password=" + password + '}';
    }
    
    
    
}
