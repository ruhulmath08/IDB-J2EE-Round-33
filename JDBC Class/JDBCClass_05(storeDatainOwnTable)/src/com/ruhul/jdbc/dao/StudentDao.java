package com.ruhul.jdbc.dao;

import com.ruhul.jdbc.domain.Student;
import java.util.List;

public interface StudentDao {
    //save data using student object in database
    public void save(Student s);
    
    //update data using student object in database
    public void update(Student s);
    
    //delete data using student object in database
    public void delete(int id);
    
    //return multiple values we ned multiple information
    public List<Student> getStudents(); 
    
    //return single value if we ned single information
    public Student getStudent(int id); 
}
