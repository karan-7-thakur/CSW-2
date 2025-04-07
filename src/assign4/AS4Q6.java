package assign4;

import java.util.Date;

class InnerAS4Q6 {

    int[][] arr;
    String name;

    public InnerAS4Q6(String name) {
        this.name = name;
        arr = new int[100][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[50];
        }
    }

    public void finalize() {
        System.out.println("Cleared object: " + this.name);
    }

}

public class AS4Q6 {

    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("Total Memory: " + run.totalMemory() / (1024.0 * 1024) + "MB");
        System.out.println("Free Memory: " + run.freeMemory() / (1024.0 * 1024) + "MB");

        InnerAS4Q6 obj1 = new InnerAS4Q6("object 1");
        InnerAS4Q6 obj2 = new InnerAS4Q6("object 2");
        InnerAS4Q6 obj3 = new InnerAS4Q6("object 3");
        InnerAS4Q6 obj4 = new InnerAS4Q6("object 4");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Free Memory after object creation : " + run.freeMemory() / (1024.0 * 1024)
                + "MB");

        obj2 = null;
        obj3 = null;
        obj4 = obj1;
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Free Memory after garbage creation (After gc) : " + run.freeMemory() / (1024.0 * 1024)
                + "MB");

    }
}
