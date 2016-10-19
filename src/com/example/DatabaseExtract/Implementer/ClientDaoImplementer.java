package com.example.DatabaseExtract.Implementer;

import com.example.DatabaseExtract.Client;
import com.example.DatabaseExtract.DatabaseConnection.DbConnection;
import com.example.DatabaseExtract.Interface.ClientDaO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDaoImplementer implements ClientDaO{
   private DbConnection dbConnection=new DbConnection();
    @Override
    public List<Client> getall() throws ClassNotFoundException,SQLException {
         String query = "Select * from project_management"+".clients";
         dbConnection.open();
         PreparedStatement stmt=dbConnection.init(query);
         
         
            }

    

  
    @Override
    public int add(Client c) throws SQLException,ClassNotFoundException {
        String query = " insert into clients (client_id,client_name, client_description)" + "values (?,?,?)";
         dbConnection.open();
         PreparedStatement stmt=dbConnection.init(query);
         stmt.setInt(1, c.getClientId());
         stmt.setString(2, c.getClientName());
         stmt.setString(3, c.getClientDescription());
         int result=dbConnection.executeUpdate();
         dbConnection.close();
         return result;
         
    }
    
}
