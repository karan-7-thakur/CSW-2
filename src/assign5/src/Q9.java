package assign5.src;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\assign5\\diary.txt");
        Scanner sc = new Scanner(System.in);

        try {
            if (file.exists()) {
                System.out.println("File exists");

            } else {
                file.createNewFile(); // also returns true false if file is created ot not

                System.out.println("File is created");
            }

            BufferedWriter bufferWriteFile = new BufferedWriter(new FileWriter(file, true));

            String diaryEntry = "";
            System.out.println("Enter your diary entry:");
            diaryEntry += LocalDate.now().toString() + " : " + sc.nextLine() + "\n";
            bufferWriteFile.write(diaryEntry);

            bufferWriteFile.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {
            sc.close();
        }
    }
}
