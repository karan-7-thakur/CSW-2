package assign5.src;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial string:");
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        while (true) {
            System.out.println("\nCurrent string: " + sb);
            System.out.println("Choose an operation:");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the substring to add:");
                    String substring = scanner.nextLine();
                    System.out.println("Enter the position to insert the substring:");
                    int position = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (position >= 0 && position <= sb.length()) {
                        sb.insert(position, substring);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 2:
                    System.out.println("Enter the starting index of the range to remove:");
                    int start = scanner.nextInt();
                    System.out.println("Enter the ending index of the range to remove:");
                    int end = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (start >= 0 && end <= sb.length() && start < end) {
                        sb.delete(start, end);
                    } else {
                        System.out.println("Invalid range.");
                    }
                    break;

                case 3:
                    System.out.println("Enter the index of the character to modify:");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter the new character:");
                    char newChar = scanner.nextLine().charAt(0);
                    if (index >= 0 && index < sb.length()) {
                        sb.setCharAt(index, newChar);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.println("Enter the string to concatenate:");
                    String toConcat = scanner.nextLine();
                    sb.append(toConcat);
                    break;

                case 5:
                    System.out.println("Exiting program. Final string: " + sb);
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}