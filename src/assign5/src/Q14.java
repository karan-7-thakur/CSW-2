package assign5.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Q14 {
    public static void main(String[] args) {
        File source = new File(
                "C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\assign5\\diary.txt");
        File destination = new File(
                "C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\assign5\\diary2.txt");
    
        try {
            if (!destination.exists()) {
                destination.createNewFile();
            }
            List<String> copiedLines = new ArrayList<>();
            BufferedReader bfreader = new BufferedReader(new FileReader(source));
            String line;
            while ((line = bfreader.readLine()) != null) {
                copiedLines.add(line);
            }

            System.out.println(copiedLines);

            BufferedWriter bfwriter = new BufferedWriter(new FileWriter(destination, true));

            for (String string : copiedLines) {
                bfwriter.write(string);
                bfwriter.newLine();
            }

            System.out.println("SucessFully Copied The Items");
            bfreader.close();
            bfwriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
