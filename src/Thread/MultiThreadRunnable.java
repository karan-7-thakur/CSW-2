package Thread;

public class MultiThreadRunnable {

    int count = 0;

    public void count() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        MultiThreadRunnable objOfClass = new MultiThreadRunnable();
        Runnable obj = () -> {
            // int count = 0;
            for (int i = 1; i < 1000000; i++) {
                // System.out.println("THis is Thread " + Thread.currentThread().getName() + "
                // Count: " + (count + dummyvar));
                // count++;
                objOfClass.count();
            }
        };

        // dummyvar=dummyvar+2;

        // You can't write obj.start() directly --
        Thread th1 = new Thread(obj, "Thread 1");
        Thread th2 = new Thread(obj, "Thread 2");
        th1.start();
        th2.start();

        System.out.println("Priority of thread 1 is: " + th1.getPriority());
        System.out.println("Priority of thread 2 is: " + th2.getPriority()); // It will give the default priority i.e. 5

        // if threads are running for n times it will tell the main thread that unitl
        // and unless the threads are not completed --> main method will not die
        try {
            th1.join(); // make the priority same to avoid confusion
            th2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("value of: " + objOfClass.getCount());
    }
}
