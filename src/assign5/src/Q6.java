package assign5.src;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for a string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();

        // Display the character array
        System.out.println("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Prompt the user to enter a character to search
        System.out.print("Enter a character to search: ");
        char searchChar = scanner.next().charAt(0);

        // Find the first and last occurrences of the character
        int firstOccurrence = inputString.indexOf(searchChar);
        int lastOccurrence = inputString.lastIndexOf(searchChar);

        // Display the positions found
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + searchChar + "': " + firstOccurrence);
            System.out.println("Last occurrence of '" + searchChar + "': " + lastOccurrence);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }

        scanner.close();

    }
}
