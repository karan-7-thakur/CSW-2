package assign8;

public class q3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Runnable add = () -> {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        };

        Runnable sub = () -> {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        };

        Thread th1 = new Thread(add, "Addition");
        Thread th2 = new Thread(sub, "Subtract");

        th1.start();
        th2.start();
    }
}
