package com.example.oracleDataConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OracleDBConnection {
    private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
    private static final String HOST = "jdbc:oracle:thin:@localhost";
    private static final String PORT = "1521";
    private static Connection connection;
    private static final String url = HOST + ":" + PORT + ":";

    public static Connection getConnections(String dbName, String dbUserName, String dbPass) {
        try {
            connection = DriverManager.getConnection(url + dbName, dbUserName, dbPass);
            System.out.println("Connected!!!");

        } catch (Exception e) {
            Logger.getLogger(OracleDBConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        return connection;
    }
}
