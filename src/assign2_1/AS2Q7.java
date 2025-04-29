package assign2_1;

import java.util.Comparator;
import java.util.Arrays;;

class Student2 {
    String name;
    int rollNo;
    int age;

    Student2(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Roll No.: " + rollNo + ", Age: " + age;
    }

}

class RollNoComparator implements Comparator<Student2> {
    public int compare(Student2 s1, Student2 s2) {
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}

class AgeComparator implements Comparator<Student2> {
    public int compare(Student2 s1, Student2 s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

public class AS2Q7 {
    public static void main(String[] args) {
        Student2[] students = { new Student2("Ankan", 3, 20), new Student2("Sayan", 2, 22),
                new Student2("Rudranil", 1, 21) };

        // -----------------------------------------------------
        Arrays.sort(students, new RollNoComparator());
        System.out.println("Students sorted by Roll No.:");
        for (Student2 student : students) {
            System.out.println(student);
        }

        // -----------------------------------------------------
        Arrays.sort(students, new AgeComparator());
        System.out.println("\nStudents sorted by Age:");
        for (Student2 student : students) {
            System.out.println(student);
        }
    }

}
