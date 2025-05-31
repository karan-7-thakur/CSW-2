package Thread;

public class MultiThreading3 {
    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread Name: " + Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    // System.out.println(e);
                }
            }
        };

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread Name: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                    // System.out.println(e);
                }
            }
        };

        Thread th1 = new Thread(task);
        Thread th2 = new Thread(task1);

        th1.start();
        th2.start();

        // th2.setDaemon(true);

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
