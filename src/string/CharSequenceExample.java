package string;

public class CharSequenceExample {

    public static void main(String[] args) {
        //  interface ge  directly converted to string
        //CharSequence:  Char[], which is implemented using strings 
        CharSequence seq = "Hello";

        CharSequence seq1 = new String("Hello");

        // calls .toString(); internally to print
        System.out.println(seq);
        System.out.println(seq1);

        // CharSequence Methods 
        System.out.println(seq.subSequence(0, 3));  // excluding 3

    }
}
