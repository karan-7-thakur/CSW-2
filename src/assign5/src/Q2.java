package assign5.src;

public class Q2 {
    public static void main(String[] args) {
        // Demonstrating immutability of String
        String original = "Hello";
        System.out.println("Original String: " + original);

        // Attempt to modify the String
        // String modified = original.replace(", World!");
        // System.out.println("Modified String: " + modified);
        System.out.println("Original String after modification attempt: " + original);

        // Demonstrating String as a CharSequence
        CharSequence charSequence = "This is a CharSequence example.";
        System.out.println("\nCharSequence: " + charSequence);

        // Using CharSequence methods
        System.out.println("Length: " + charSequence.length());
        System.out.println("Character at index 5: " + charSequence.charAt(5));
        System.out.println("Subsequence (5, 15): " + charSequence.subSequence(5, 15));
    }
}
