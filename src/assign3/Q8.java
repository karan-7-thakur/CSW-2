package assign3;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String msg) {
        super(msg);
    }
}

public class Q8 {

    static void checkNumber(int number) throws CustomCheckedException {
        if (number < 0)
            throw new CustomCheckedException("Number is less than zero!");
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
        int num = -235;
        try {
            checkNumber(num);
        } catch (CustomCheckedException e) {
            System.out.println(e.getMessage());
        }
    }
}
