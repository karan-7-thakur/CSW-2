package Thread;

public class MultiThreadTrthread1 extends Thread {
    int count = 0;

    // if you are using thread --> all should be handled inside run method
    // This code will be shared by all methods is common for all thread objects
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("THis is " + "Thread" + Thread.currentThread().getName() + "count: " + count);
            count++;
        }
    }

    public static void main(String[] args) {
        MultiThreadTrthread1 th1 = new MultiThreadTrthread1();
        MultiThreadTrthread1 th2 = new MultiThreadTrthread1();
        // COmpiler will call the run method implicitly when you start the threadf
        th1.start(); // To start any method call start() method if it extends Thread class
        th2.start();

    }
}
