/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.DatabaseExtract.Interface;

import com.example.DatabaseExtract.Client;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HOME
 */
public interface ClientService {
    
      public List<Client> getall()throws ClassNotFoundException,SQLException;
   public  int add(Client c)throws SQLException,ClassNotFoundException;

    
    
    
}
