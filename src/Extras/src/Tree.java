package Extras.src;

import java.util.TreeSet;

class Test {
    int a;

    public Test(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Test [a=" + a + "]";
    }

}

public class Tree {
    public static void main(String[] args) {
        TreeSet<Test> ts = new TreeSet<>();
        ts.add(new Test(5));
        System.out.println(ts);

    }
}
