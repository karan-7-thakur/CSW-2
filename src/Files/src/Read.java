package Files.src;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class Read {
    public static void main(String[] args) {

        File file = new File(
                "C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\Files\\Test2.txt");

        System.out.println("File Exists: " + file.exists());
        try {
            boolean status = file.createNewFile();
            System.out.println("File is created: " + status);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Read Premission: " + file.canRead());
        System.out.println("Write Permission: " + file.canWrite());
        // System.out.println("Deleted: "+file.delete());

    }
}
