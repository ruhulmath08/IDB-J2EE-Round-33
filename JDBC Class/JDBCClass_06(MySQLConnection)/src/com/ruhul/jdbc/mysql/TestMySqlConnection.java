/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruhul.jdbc.mysql;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author J2EE-33
 */
public class TestMySqlConnection {

    public static void main(String[] args) throws SQLException {
        Connection conn = MySqlDbConnection.getConnection();

        Statement statement = conn.createStatement();
        /*
        String q1 = "create table emp(eid integer, ename varchar(20), salary integer)";
        int a = statement.executeUpdate(q1);
        System.out.println("Table is created"+a);
        
        String q2 = "insert into emp values(1000, 'Ruhul', 10000)";
        String q3 = "insert into emp values(1010, 'Urmi', 10500)";
        String q4 = "insert into emp values(1000, 'Shahrier', 11000)";
        statement.executeUpdate(q2);
        statement.executeUpdate(q3);
        statement.executeUpdate(q4);
        System.out.println("Value are inserted successfully");
        */
        String q5 = "select * from emp";
        ResultSet set = statement.executeQuery(q5);
        while(set.next()){
            System.out.println(set.getInt(1)+"---"+set.getString(2)+
                    "---"+set.getInt(3));
        }
        System.out.println("Data printing complete");
        //String q6 = "select * from emp";
        //statement.executeUpdate(q5);
        conn.close();
    }
}
