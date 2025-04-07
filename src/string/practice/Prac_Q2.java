package string.practice;

public class Prac_Q2 {

    public static void reverse(CharSequence seq) {
        String result = "";

        for (int i = seq.length() - 1; i >= 0; i--) {
            result = result + seq.charAt(i);

        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        reverse("Hello World");
        reverse(new StringBuilder("Hello World"));
        reverse(new StringBuilder("Hello World"));

    }
}
