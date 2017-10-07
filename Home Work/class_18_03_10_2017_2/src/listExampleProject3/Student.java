/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listExampleProject3;

/**
 *
 * @author J2EE-33
 */
public class Student {
    private long studentId;
    private String studentName;
    private Subject subject;
    public Thana district;
    private double salary;

        public Student(long studentId, String studentName, Subject subject, Thana district, double salary) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subject = subject;
        this.district = district;
        this.salary = salary;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Subject getSubject() {
        return subject;
    }

    public Thana getDistrict() {
        return district;
    }

    public double getSalary() {
        return salary;
    }
    
    
}
