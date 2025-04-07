package assign2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // @Override
    // public int compareTo(User obj2){
    // return this.getAge()-obj2.getAge();
    // }

}

class ArrayListUsers {
    private ArrayList<User> users;

    public ArrayListUsers() {
        users = new ArrayList<User>();
    }

    void addUsers(User u) {
        users.add(u);
    }

    void print() {
        for (User user : users) {
            System.out.println("Name: " + user.getName() + " Age: " + user.getAge());

        }

    }

    void sort() {
        Collections.sort(users, new AgeCompare());
    }
}

class AgeCompare implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u1.getAge() - u2.getAge();
    }
}

public class AS2Q2 {

    public static void main(String[] args) {
        ArrayListUsers users = new ArrayListUsers();
        users.addUsers(new User("Jane", 30));
        users.addUsers(new User("Xiangling", 22));
        users.addUsers(new User("Barbra", 10));

        users.sort();
        users.print();

    }

}
