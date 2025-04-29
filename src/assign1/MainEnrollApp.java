package assign1;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

// Interface to ensure loose coupling
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);

    void dropStudent(Student student, Course course);

    void displayEnrollmentDetails();
}

// Class representing a student
class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

// Class representing a course
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Class handling the enrollment process
class Enrollment implements EnrollmentSystem {
    private List<Student> students;
    private List<Course> courses;
    private Map<Student, List<Course>> enrollmentMap;

    public Enrollment() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrollmentMap = new HashMap<>();
    }

    @Override
    public void enrollStudent(Student student, Course course) {
        if (!enrollmentMap.containsKey(student)) {
            enrollmentMap.put(student, new ArrayList<>());
        }
        enrollmentMap.get(student).add(course);
    }

    @Override
    public void dropStudent(Student student, Course course) {
        if (enrollmentMap.containsKey(student)) {
            enrollmentMap.get(student).remove(course);
        }
    }

    @Override
    public void displayEnrollmentDetails() {
        for (Map.Entry<Student, List<Course>> entry : enrollmentMap.entrySet()) {
            System.out.println("Student: " + entry.getKey().getName());
            for (Course course : entry.getValue()) {
                System.out.println("  Enrolled in: " + course.getCourseName());
            }
        }
    }
}

// Main class to demonstrate functionality
public class MainEnrollApp {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new Enrollment();

        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student1, course2);
        enrollmentSystem.enrollStudent(student2, course1);

        enrollmentSystem.displayEnrollmentDetails();

        enrollmentSystem.dropStudent(student1, course2);

        enrollmentSystem.displayEnrollmentDetails();
    }
}