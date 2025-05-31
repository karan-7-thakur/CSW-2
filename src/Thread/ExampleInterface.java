package Thread;

public class ExampleInterface {
    int count = 0;

    public void increaseCount() {
        count++;
    }

    public static void main(String[] args) {
        ExampleInterface inter = new ExampleInterface();

        Runnable obj = () -> {

            for (int i = 0; i < 10000; i++) {

                // System.out.println("This is " + Thread.currentThread().getName()+"
                // "+inter.count);
                // count++; // cannot use the variable inside the runnable object. if
                // re-instantiating after this object, then its value will be final
                inter.increaseCount();

            }

        };

        Thread th1 = new Thread(obj, "Thread 1"); // can pass one or two params.
        Thread th2 = new Thread(obj, "Thread 2");

        th2.setPriority(1); // Higher Priority will run first
        th1.setPriority(1); // setting the priority[1-10] max priority is 10- to execute the max first
        th1.start();
        th2.start();

        System.out.println("Thread 1 Priority: " + th1.getPriority());
        System.out.println("Thread 2 Priority: " + th2.getPriority());

        try {
            th1.join(); // to make the main thread wait till both the thread 1 and 2 is completed
            th2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(inter.count);
    }
}
