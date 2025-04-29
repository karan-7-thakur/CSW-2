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
        return Integer.compare(this.rollNumber, s.rollNumber);
    }

    public static void bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

}

public class AS2Q5 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Sayantan", 102, 95.5);
        students[1] = new Student("Rounak", 103, 88.0);
        students[2] = new Student("Srinjoy", 101, 92.0);
        Student.bubbleSort(students);
        System.out.println("Sorted student details:");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

}
