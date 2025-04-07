package assign5.src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\assign5\\diary.txt");

        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter bfwriter = new BufferedWriter(new FileWriter(file, true));
            System.out.print("Enter the Diary Entry: ");
            bfwriter.newLine();
            bfwriter.write(LocalDate.now().toString() + " : " + sc.nextLine());
            System.out.println("Write Sucessful");
            bfwriter.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
