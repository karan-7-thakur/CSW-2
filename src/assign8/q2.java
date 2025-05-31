package assign8;

class Add extends Thread {
    int num1, num2;

    Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

public class q2 {

    public static void main(String[] args) {
        Add th1 = new Add(10, 5);

        th1.start();

    }
}