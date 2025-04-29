package assign2_1;

//Wrapper Class
class Student<T> {
    private String name;
    private T rollNumber;
    private int age;

    public Student(String name, T rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNumber);
        System.out.println("Age: " + age);
    }

}

public class AS2Q1 {
    public static void main(String[] args) {

        Student<Integer> s1 = new Student<>("ABC", 112, 20);
        Student<String> s2 = new Student<>("PQR", "A12K6", 21);

        System.out.println("Student 1 Details:");
        s1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details:");
        s2.displayDetails();

    }
}