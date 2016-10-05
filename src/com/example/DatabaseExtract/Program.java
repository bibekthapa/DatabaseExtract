package com.example.DatabaseExtract;

import com.example.DatabaseExtract.constant.DBconstant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;

            conn = DriverManager.getConnection(DBconstant.DB_URL, DBconstant.DB_Username, DBconstant.DB_Password);
            System.out.println("Database is connected");
            viewTable(conn);

            conn.close();

        } catch (Exception ioe) {
            System.out.println("Not connected to DB: error:" + ioe);

        }
        }
    
     public  static void viewTable(Connection conn)
        {
            Statement stmt=null;
            String query="Select * from project_management"+".clients";
            try
            {
                stmt=conn.createStatement();
                ResultSet rs= stmt.executeQuery(query);
                while(rs.next())
                {
                    int clientId=rs.getInt("client_id");
                    String clientName=rs.getString("client_name");
                    String clientDescription=rs.getString("client_description");
                    System.out.println("clientID:"+"\t"+clientId+"  clientName"+"\t"+clientName+"  clientDescription"+"\t"+clientDescription);
                
                }
                
            
            }catch(SQLException dberror)
            {
              
            }
        
        }

}
