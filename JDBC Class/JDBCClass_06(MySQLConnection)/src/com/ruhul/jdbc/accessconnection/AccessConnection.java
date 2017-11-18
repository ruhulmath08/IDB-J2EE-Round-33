package com.ruhul.jdbc.accessconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccessConnection {

    public static void main(String[] args) {
        Connection conn = AccessConnection.getAccessConnection();
    }
    public static Connection getAccessConnection() {
        String user = "";
        String pass = "";
        Connection con = null;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://E:\\J2EE-Ruhul\\Advanced Java\\JDBC/feroza.accdb", user, pass);
            System.out.println("Connected!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
