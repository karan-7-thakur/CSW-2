//compareTo belongs to comparable class.
//compare(__,__) belongs to comparator class.
package assign2_2;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj) {
        Student object = (Student) obj;
        return this.age == object.age && this.name.equals(object.name) && this.marks == object.marks;
    }

    @Override
    public String toString() {
        return "{Student's name:" + name + ", age: " + age + ", marks:" + marks + "}";
    }
}

public class test {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<>();
        Student A = new Student("Kart", 20, 89);
        Student B = new Student("Bob", 19, 100);
        Student C = new Student("Marl", 21, 99);
        list.add(A);
        list.add(B);
        list.add(C);

        // displaying the list of students
        for (Student std : list) {
            System.out.println(std);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter details of the student: ");
        String name = sc.next();
        int age = sc.nextInt();
        int marks = sc.nextInt();
        Student std = new Student(name, age, marks);
        System.out.println(list.contains(std));

        // removing
        list.remove(std);
        System.out.println(list);

        int size = 0;
        for (Student student : list) {
            size++;
        }
        System.out.println("The total size of the list is: " + size);

        System.out.println("Object is equals to the other? " + B.equals(std));

    }
}
