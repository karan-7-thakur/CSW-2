package assign3;

class CustomNullPointerException extends RuntimeException {

    public CustomNullPointerException(String message) {
        super(message);
    }
}

public class AS3Q2 {

    public static void main(String[] args) throws CustomNullPointerException {

        throw new CustomNullPointerException("Custom Null Exception");

    }

}
