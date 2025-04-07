package assign5.src;

import java.io.File;

public class Q13 {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\user\\OneDrive\\Documents\\2nd yr material\\SEM 04\\CSW\\src\\assign5\\delete.txt");

        boolean status = file.delete();
        System.out.println(status ? "File is SucessFully Deleted" : "File Doesn't Exist");

    }
}
