
class College {
    private String collegeName;
    private String collegeLoc;

    public College(College college) {
        this.collegeName = college.collegeName;
        this.collegeLoc = college.collegeLoc;
    }

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public void print() {
        System.out.println("College Name: " + collegeName);
        System.out.println("College Location: " + collegeLoc);
    }

}

class Student {
    private String studentName;
    private String studentId;
    College college;

    public Student(String studentName, String studentId, College college) {
        college.print();
        this.studentName = studentName;
        this.studentId = studentId;

    }

    public void print() {

        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);

    }

}

public class Q6 {
    public static void main(String[] args) {
        College clg = new College("ITER", "BBSR");
        Student student = new Student("Rohan", "IT-001", clg);

        student.print();

    }
}
