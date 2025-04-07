package Garbage.src;

import java.util.Arrays;

public class Garbage {

    int size;
    int[] arr;

    public Garbage(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void display() {
        Garbage obj = new Garbage(3);
        System.out.println("Size = " + size);
        System.out.println(Arrays.toString(arr));
    }

    // this had been depricated
    public void finalize() throws Throwable { // runs the code first and then clears the GC but not recommended as there
                                              // is no gaurantee when the GC will run
        System.out.println("Obj " + this.arr);
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory: " + runtime.totalMemory() / (1024.0 * 1024) + "MB");
        System.out.println("Free Memory before object creation: " + runtime.freeMemory() / (1024.0 * 1024) + "MB");
        Garbage obj = new Garbage(50);
        Garbage obj1 = new Garbage(0);
        obj1 = obj;

        // calling garbage collector -> for a major collection
        System.gc();

        obj.display();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Free Memory after object creation: " + runtime.freeMemory() / (1024.0 * 1024) + "MB");
    }
}
