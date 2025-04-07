package assign5.src;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        String dirPath = "C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\assign5\\src";

        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null && files.length > 0) {
                System.out.printf("%-30s %-10s %-20s %-10s %-10s\n", "File Name", "Size (bytes)", "Last Modified",
                        "Readable", "Writable");
                System.out.println(
                        "--------------------------------------------------------------------------------------------------");

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                for (File file : files) {
                    System.out.printf("%-30s %-10d %-20s %-10s %-10s\n",
                            file.getName(),
                            file.length(),
                            sdf.format(file.lastModified()),
                            file.canRead(),
                            file.canWrite());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path or directory does not exist!");
        }
    }
}
