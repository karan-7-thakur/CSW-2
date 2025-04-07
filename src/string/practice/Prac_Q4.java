package string.practice;

public class Prac_Q4 {

    // checks Palindrome
    public static boolean isPalindrome(StringBuffer str) {
        int i = 0;
        int j = str.length() - 1;
        long start = System.nanoTime();
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                long end = System.nanoTime();
                System.out.println("Time taken by isPalindrome() Buffer is " + (end - start) + "ns");
                return false;
            }
            i++;
            j--;

        }
        long end = System.nanoTime();
        System.out.println("Time taken by isPalindrome() Buffer is " + (end - start) + "ns");
        return true;
    }

    public static boolean isPalindrome(StringBuilder str) {
        int i = 0;
        int j = str.length() - 1;
        long start = System.nanoTime();
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                long end = System.nanoTime();
                System.out.println("Time taken by isPalindrome() Builder is " + (end - start) + "ns");
                return false;
            }
            i++;
            j--;

        }
        long end = System.nanoTime();
        System.out.println("Time taken by isPalindrome() Builder is " + (end - start) + "ns");
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(new StringBuilder("12345678987654321")));
        System.out.println(isPalindrome(new StringBuffer("12345678987654321")));

    }
}
