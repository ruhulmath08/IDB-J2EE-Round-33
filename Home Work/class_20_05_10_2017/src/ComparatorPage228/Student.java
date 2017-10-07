package ComparatorPage228;

public class Student {
    String firstName, lastName;
    int studentId;
    double GPA = 0.0;

    public Student(String firstName, String lastName, int studentId, double GPA) {
        if (firstName == null || lastName == null || studentId == 0 || GPA == 0.0)throw new IllegalArgumentException();
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGPA() {
        return GPA;
    }
       
}
