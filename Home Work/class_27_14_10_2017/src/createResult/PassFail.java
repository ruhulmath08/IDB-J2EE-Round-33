package createResult;

public class PassFail {

    private String name;
    private int studentId;

    public PassFail(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;

    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void passFail(int theoryMarks, int evdienceMarks) {
        int totalMarks = theoryMarks + evdienceMarks;
        if (theoryMarks > 100 || evdienceMarks > 50) {
            System.out.println("Invalid marks");
        } else {
            switch (totalMarks) {
                case 1:
                    totalMarks = 150;
                    System.err.println("A+");
                    break;
                case 2:
                    totalMarks = 139;
                    System.err.println("A");
                    break;

                case 3:
                    totalMarks = 129;
                    System.err.println("B");
                    break;

                case 4:
                    totalMarks = 119;
                    System.err.println("c");
                    break;

                default:
                    System.out.println("Fail");
            }
        }

    }
}
