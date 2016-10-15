package com.example.DatabaseExtract;

import com.example.DatabaseExtract.constant.DBconstant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;

            conn = DriverManager.getConnection(DBconstant.DB_URL, DBconstant.DB_Username, DBconstant.DB_Password);
            System.out.println("Database is connected");
          //  viewTable(conn);
            insertTable(conn);

            conn.close();
            

        } catch (Exception ioe) {
            System.out.println("Not connected to DB: error:" + ioe);

        }
        
    }

    public static void viewTable(Connection conn) {
        Statement stmt = null;
        String query = "Select client_description,client_id,client_name from project_management" + ".clients";
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int clientId = rs.getInt("client_id");
                String clientName = rs.getString("client_name");
                String clientDescription = rs.getString("client_description");
                System.out.println("clientID:" + "\t" + clientId + "  clientName" + "\t" + clientName + "  clientDescription" + "\t" + clientDescription);

            }

        } catch (SQLException dberror) {

        }

    }
    
    public  static void insertTable(Connection conn)
            {
                Scanner reader = new Scanner(System.in);
            //stmt=null;
           
           System.out.println("Enter the client name");
           String clientName=reader.nextLine();
            System.out.println("Enter the client description \n");
           String clientDesc=reader.nextLine();
           // String query="Insert into project_management values(5,Benter,Sql programming)"+".clients";
           String query = " insert into clients (client_name, client_description)"
        + "values (?,?)";
 
           try
            {
               PreparedStatement  preparedStmt= conn.prepareStatement(query);
                    preparedStmt.setString (1, clientName);
                 preparedStmt.setString (2, clientDesc);
               
               preparedStmt.execute();
                
                
            
            }catch(SQLException dberror)
            {
              
            }
        
        }

}
