package com.ruhul.jdbc.create;

import com.ruhul.jdbc.Connection.OracleDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCreateTable {
    static Connection conn = OracleDBConnection.getConnections("xe", "hr", "hr");
    public static void main(String[] args) {
        //test connection
        String sql = "CREATE TABLE studentdb"
                + "(id INTEGER NOT NULL, studentName VARCHAR(255), "
                + "PRIMARY KEY(id))";
        
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            int i = pstm.executeUpdate();
            System.out.println("Table has been created!!!");
        } catch (SQLException ex) {
            Logger.getLogger(TestCreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
}
