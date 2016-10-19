package com.example.DatabaseExtract.DatabaseConnection;

import com.example.DatabaseExtract.constant.DBconstant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
    private Connection conn=null;
    private PreparedStatement stmt=null;
   
    
    public void open() throws ClassNotFoundException, SQLException
    {
        Class.forName(DBconstant.DB_URL);
        conn=DriverManager.getConnection(DBconstant.DB_URL, DBconstant.DB_Username, DBconstant.DB_Password);
        System.out.println("Database is connected");
        
    }
    public void close() throws SQLException
    {
            if(conn!=null && !conn.isClosed())
            {
                conn.close();
                conn=null;
            }
    }
     public PreparedStatement init(String sql) throws SQLException
     { 
         stmt=(PreparedStatement) conn.prepareStatement(sql);
         return stmt;
     }
     public ResultSet executeQuery() throws SQLException
     {
          return stmt.executeQuery();
     }
     
     public int executeUpdate() throws SQLException
     {
         return stmt.executeUpdate();
     }
     
    
    
    
}
