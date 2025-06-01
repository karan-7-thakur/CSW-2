package assign8;

class SumThread extends Thread {
    int num;

    SumThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;

            // Wait for show that both are running concurently
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Sum of first " + num + " : " + sum);

    }

}

class MultiplyThread extends Thread {
    int num;

    MultiplyThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));

            // Wait for show that both are running concurently
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class q1 {

    public static void main(String[] args) {
        SumThread th1 = new SumThread(25);
        MultiplyThread th2 = new MultiplyThread(20);

        // th1.setPriority(10);
        // th2.setPriority(2);

        th2.start();
        th1.start();
    }

}

/*
 * Works completly Fine
 * Both the threads run at the same time
 * Use Thread.sleep() to show the difference and Priority is also working
 */