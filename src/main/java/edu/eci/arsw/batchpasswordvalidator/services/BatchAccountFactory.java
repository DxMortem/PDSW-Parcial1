/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.services;

import com.google.inject.AbstractModule;
import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;

/**
 *
 * @author 2103110
 */
public class BatchAccountFactory {

    private static BatchAccountFactory instance = new BatchAccountFactory();
    private static Injector injector;
    
    public BatchAccountFactory() {
        
        injector = createInjector(new AbstractModule() {

                    protected void configure() {
                        bind(BatchAccountServices.class).to(BatchAccountCreator.class);
                        bind(PasswordValidator.class).to(ISO3892PasswordValidator.class);
                    }

                }      
        );
    }
    
    public BatchAccountServices getBatchAccountService(){
        return injector.getInstance(BatchAccountServices.class);
    }
    
    public static BatchAccountFactory getFactoryInstance(){
        return instance;
    }
}
