package assign1;

class College {
    private String collegeName;
    private String collegeLoc;

    public College(College college) {
        this.collegeName = college.getCollegeName();
        this.collegeLoc = college.getCollegeLoc();
    }

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }

    public void setCollegeLoc(String collegeLoc) {
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
    private College college;

    public Student(String studentName, String studentId, College college) {
        this.college = college;
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public void print() {
        college.print();
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
