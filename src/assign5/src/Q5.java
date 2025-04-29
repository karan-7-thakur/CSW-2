package assign5.src;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Convert both strings to lowercase and uppercase
        String str1Lower = str1.toLowerCase();
        String str1Upper = str1.toUpperCase();
        String str2Lower = str2.toLowerCase();
        String str2Upper = str2.toUpperCase();

        // Compare the converted strings to check case-insensitive equality
        boolean areEqualIgnoreCase = str1Lower.equals(str2Lower);

        // Display the converted strings and the result of the comparison
        System.out.println("First string in lowercase: " + str1Lower);
        System.out.println("First string in uppercase: " + str1Upper);
        System.out.println("Second string in lowercase: " + str2Lower);
        System.out.println("Second string in uppercase: " + str2Upper);
        System.out.println("Are the strings equal (case-insensitive)? " + areEqualIgnoreCase);

        scanner.close();
    }
}
