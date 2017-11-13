package com.ruhul.jdbc.service;

import com.ruhul.jdbc.Connection.OracleDBConnection;
import com.ruhul.jdbc.create.TestCreateTable;
import com.ruhul.jdbc.dao.StudentDao;
import com.ruhul.jdbc.domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentService implements StudentDao{
    
    static Connection conn = OracleDBConnection.getConnections("xe", "hr", "hr");
    @Override
    public void save(Student s) {
        try {
            if (s.getStudentName() != null) {
                PreparedStatement stmt = conn.prepareStatement("insert into studentdb(id, studentName) values (?, ?)");
                stmt.setInt(1, s.getId());
                stmt.setString(2, s.getStudentName());
                int i = stmt.executeUpdate();
                System.out.println(i + "row inserted");
            }
            //con.close
        } catch (SQLException e) {
            Logger.getLogger(TestCreateTable.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(Student s) {
        try {
            if (s.getId()!= 0) {
                PreparedStatement stmt = conn.prepareStatement("update studentdb set studentName = ? where id = ?");
                stmt.setString(1, s.getStudentName());
                stmt.setInt(2, s.getId());
                int i = stmt.executeUpdate();
                System.out.println(i + "record updated");
            }
            //con.close
        } catch (SQLException e) {
            Logger.getLogger(TestCreateTable.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void delete(int id) {
        try {
            if (id!= 0) {
                PreparedStatement stmt = conn.prepareStatement("delete studentdb where id = ?");
                stmt.setInt(1, id);
                int i = stmt.executeUpdate();
                System.out.println(i + "record Deleted");
            }
            //con.close
        } catch (SQLException e) {
            Logger.getLogger(TestCreateTable.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        try {
            Student s;
            PreparedStatement stmt = conn.prepareStatement("select * from studentdb");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setStudentName(rs.getString(2));
                list.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Student getStudent(int id) {
        Student s = null;
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from studentdb where id = ?");
            stmt.setInt(1, id);;
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt(1));
                s.setStudentName(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }    
}