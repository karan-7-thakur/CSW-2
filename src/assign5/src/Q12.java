package assign5.src;

import java.io.File;

public class Q12 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\assign5");

        try {
            if (file.isDirectory()) {
                System.out.println("Its Is a Directory");

                // String[] files = file.list();

                // for (String string : files) {
                // System.out.println(string);

                // }

                File[] files = file.listFiles();
                int i = 1;
                for (File file2 : files) {
                    System.out.println(i++ + "| " + file2.getName());

                }

            } else {
                System.out.println("Location is not a Directory");
            }

        } catch (Exception e) {

        }
    }
}
