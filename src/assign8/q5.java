package assign8;

public class q5 {

    int start, end;
    boolean check = true; // can produce

    public q5(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public synchronized void printOdd() {
        while (start < end) {
            while (!check) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Odd: " + start);
            start++;
            check = false;
            notify();
        }
    }

    public synchronized void printEven() {
        while (start < end) {

            while (check) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Even: " + start);
            check = true;
            start++;
            notify();

        }

    }

    public static void main(String[] args) {

        int start = 4, end = 14;

        q5 obj = new q5(start, end);

        Thread th1 = new Thread(() -> obj.printEven());
        Thread th2 = new Thread(() -> obj.printOdd());

        if (start % 2 == 0) {
            th1.start();
            th2.start();
        } else {
            th2.start();
            th1.start();
        }
    }
}
