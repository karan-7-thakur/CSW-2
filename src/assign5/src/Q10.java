package assign5.src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q10 {
    public static void main(String[] args) {

        File file = new File(
                "C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\assign5\\diary2.txt");

        try {
            boolean status = file.createNewFile();
            System.out.println(status ? "File is Created" : "File Already Exists");

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String read = "";
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                read += line + "\n";

            }
            System.out.println("---------------------------------------------");
            System.out.println(read);
            System.out.println("---------------------------------------------");
            bufferedReader.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}
