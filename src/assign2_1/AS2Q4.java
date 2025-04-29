package assign2_1;

class Student implements Comparable<Student> {
    private String name;
    private int rollNumber;
    private double totalMark;

    public Student(String name, int rollNumber, double totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Total Marks: " + totalMark;
    }

    public int compareTo(Student s) {
        return Double.compare(this.totalMark, s.totalMark);
    }

    public static Student findStudentByRollNumber(Student[] students, int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

}

public class AS2Q4 {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("Abhishek", 101, 95.5);
        students[1] = new Student("Chayan", 102, 88.0);
        students[2] = new Student("Prithwish", 103, 92.0);
        int searchRollNumber = 102;
        Student foundStudent = Student.findStudentByRollNumber(students, searchRollNumber);
        if (foundStudent != null) {
            System.out.println("Student found: \n" + foundStudent.toString());
        } else {
            System.out.println("Student with Roll Number " + searchRollNumber + " not found.");
        }
        int comparisonResult = students[0].compareTo(students[1]);
        if (comparisonResult > 0) {
            System.out.println(students[0].getName() + " has scored more than " + students[1].getName());
        } else if (comparisonResult < 0) {
            System.out.println(students[1].getName() + " has scored more than " + students[0].getName());
        } else {
            System.out.println(students[0].getName() + " and " + students[1].getName() + " have scored the same.");
        }
    }

}