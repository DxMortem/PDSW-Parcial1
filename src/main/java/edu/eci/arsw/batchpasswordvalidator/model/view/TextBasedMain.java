/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.batchpasswordvalidator.model.view;

import edu.eci.arsw.batchpasswordvalidator.model.AccountRequest;
import edu.eci.arsw.batchpasswordvalidator.services.BatchAccountFactory;
import edu.eci.arsw.batchpasswordvalidator.services.BatchAccountServices;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author hcadavid
 */
public class TextBasedMain {

    public static void main(String a[]) throws MalformedURLException, IOException {
        BatchAccountServices bac = BatchAccountFactory.getFactoryInstance().getBatchAccountService();
        
        List<AccountRequest> rejected=bac.createAccounts(loadRequests());
        
        if (rejected.size()>0){
            System.out.println("The following accounts were rejected:"+rejected);
        }
        else{
            System.out.println("All users registered successfully");
        }
        
    }

    
    private static List<AccountRequest> loadRequests() throws IOException {
        List<AccountRequest> requests = new LinkedList<>();

        URL batchData = new URL("http://profesores.is.escuelaing.edu.co/hcadavid/tmp/ureq.txt");
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(batchData.openStream()))) {
            String inputLine;
            String uname, pwd;
            while ((inputLine = in.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(inputLine, ",");
                uname = st.nextToken();
                pwd = st.nextToken();
                requests.add(new AccountRequest(uname, pwd));
            }
        }

        return requests;

    }

}
