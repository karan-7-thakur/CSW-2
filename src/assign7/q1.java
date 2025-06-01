package assign7;

interface StringProcessor {
    public int length(String str);
}

public class q1 {

    static int getLenggth(String str, StringProcessor op) {
        return op.length(str);

    }

    public static void main(String[] args) {

        // ----------------------------------- ANS
        // Lambda Exp. without any method passing
        StringProcessor str = (string) -> string.length();
        System.out.println(str.length("Hello"));
        System.out.println();

        // Passing the LambdaExp to a method
        int length = getLenggth("Hello", (str1) -> {
            return str1.length();
        });
        System.out.println(length);

    }
}
