package assign5.src;

import java.io.File;

public class Q15 {
    public static void main(String[] args) {
        String path = "C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\assign5\\";
        String original = "Test.txt";
        String reName = "Renamed.txt";

        File file = new File(path + original);

        try {
            if (file.exists()) {
                boolean status = file.renameTo(new File(path + reName));
                if (status) {
                    System.out.println("File Renamed");

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
