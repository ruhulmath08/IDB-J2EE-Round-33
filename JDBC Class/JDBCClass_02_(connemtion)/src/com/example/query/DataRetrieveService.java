package com.example.query;


import com.example.employees.Employees;
import com.example.oracleDataConnection.OracleDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajail Islam
 */
public class DataRetrieveService {

   static Connection conn = OracleDBConnection.getConnections("xe", "hr", "hr");

    public static List<Employees> getEmployees() {
        List<Employees> list = new ArrayList<>();

        try {
            Employees employee;
            PreparedStatement stmt = conn.prepareStatement("select * from employees");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                employee = new Employees();
                employee.setEmployeeID(rs.getInt(1));
                employee.setLastName(rs.getString(2));
           

                list.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataRetrieveService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
