package Thread;

public class ProduceConsume {
    int data = 0;
    boolean check = true; // can produce

    // Is like a setter method
    public synchronized void produce(int val) {
        while (!check) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = val;
        System.out.println("Produce " + data);
        check = false;
        notify();
    }

    // is like a getter method
    public synchronized void consume() {
        while (check) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consume " + data);
        check = true;
        notify();
    }

    public static void main(String[] args) {
        ProduceConsume obj = new ProduceConsume();

        // PRODUCING
        Runnable objThread1 = () -> {
            for (int i = 0; i < 10; i++) {
                obj.produce(i);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        };

        // CONSUMING
        Runnable objThread2 = () -> {
            for (int i = 0; i < 10; i++) {
                obj.consume();
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        };

        Thread th1 = new Thread(objThread1);
        Thread th2 = new Thread(objThread2);
        th1.start();
        th2.start();

    }
}
