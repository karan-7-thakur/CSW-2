package assign2_2;

import java.util.LinkedList;

class Student {
    private String name;
    private int age;
    private int mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student st = (Student) obj;
        return this.name.equals(st.name) && this.age == st.age;
    }

}

class School {
    private LinkedList<Student> students;

    public School() {
        students = new LinkedList<>();
    }

    void addStudent(Student s) {
        students.add(s);

    }

    void removeStudent(Student s) {
        students.remove(s);
    }

    void print() {
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getMark());
        }
    }

    public boolean contains(Object obj) {
        return students.contains(obj);
    }

    public int count() {
        return students.size();
    }

}

public class AS2Q4 {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student("John", 20, 90));
        school.addStudent(new Student("Alice", 21, 85));
        school.addStudent(new Student("Bob", 19, 95));
        school.print();

        boolean check = school.contains(new Student("Bob", 19, 95));
        System.out.println(check);

        school.removeStudent(new Student("Bob", 19, 95));
        System.out.println(school.count());
        school.print();

    }
}
