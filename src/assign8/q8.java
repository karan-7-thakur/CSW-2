package assign8;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    Queue<Integer> q;
    int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
        q = new LinkedList<>();
    }

    // producer
    public synchronized void put(int ele) {
        while (q.size() == capacity) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        q.offer(ele);
        System.out.println("Produced value:" + ele);
        notify();
    }

    // consumer
    public synchronized void get() {
        while (q.isEmpty()) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        int val = q.poll();
        System.out.println("Consumed: " + val);
        notify();

    }

}

public class q8 {
    public static void main(String[] args) {

        SharedBuffer obj = new SharedBuffer(3);

        // Producer
        Runnable obj1 = () -> {
            for (int i = 0; i <= 9; i++) {
                obj.put(i);

                try {
                    Thread.sleep(600);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        // consumer
        Runnable obj2 = () -> {
            for (int i = 0; i <= 15; i++) {
                obj.get();

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread putter = new Thread(obj1, "Putter");
        Thread getter = new Thread(obj2, "Getter");

        putter.start();
        getter.start();

    }
}