/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.DatabaseExtract.Implementer;

import com.example.DatabaseExtract.Client;
import com.example.DatabaseExtract.Interface.ClientService;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HOME
 */
public class ClientServiceImplementer implements ClientService {
    
    ClientService service=new ClientServiceImplementer();

    @Override
    public List<Client> getall() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int add(Client c) throws SQLException, ClassNotFoundException {
        return service.add(c);
    }

    

    
    
}
