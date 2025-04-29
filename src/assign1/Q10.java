package assign1;

import java.util.ArrayList;
import java.util.List;

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

// Course class to represent a course
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

// Enrollment class to manage student-course relationships
class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}

// Interface for enrollment system
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);

    void dropStudent(Student student, Course course);

    void displayEnrollments();
}

// Implementation of EnrollmentSystem
class EnrollmentSystemImpl implements EnrollmentSystem {
    // Enrollment list
    private List<Enrollment> enrollments = new ArrayList<>();

    @Override
    public void enrollStudent(Student student, Course course) {
        enrollments.add(new Enrollment(student, course));
        System.out.println("Student " + student.getName() + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropStudent(Student student, Course course) {
        enrollments.removeIf(e -> e.getStudent().getStudentId().equals(student.getStudentId())
                && e.getCourse().getCourseId().equals(course.getCourseId()));
        System.out.println("Student " + student.getName() + " dropped from " + course.getCourseName());
    }

    @Override
    public void displayEnrollments() {
        System.out.println("Enrollment Details:");
        for (Enrollment e : enrollments) {
            System.out.println("Student: " + e.getStudent().getName() + ", Course: " + e.getCourse().getCourseName());
        }
    }
}

// Main class to demonstrate functionality
public class Q10 {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new EnrollmentSystemImpl();

        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");

        // Enroll students
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);

        // Display enrollments
        enrollmentSystem.displayEnrollments();

        // Drop a student
        enrollmentSystem.dropStudent(student1, course1);

        // Display enrollments again
        enrollmentSystem.displayEnrollments();
    }
}
