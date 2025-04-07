//FileOperations.java
package Files.src;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp\\Documents\\7051\\CSW-2\\Files\\dir");
        //
        System.out.println(file.exists());
        try {
            if (file.createNewFile())

                System.out.println("File Created!");
            else
                System.out.println("The file is there!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Can read the file? " + file.canRead());
        System.out.println("can write the file? " + file.canWrite());
        System.out.println("FIle path " + file.getAbsolutePath());
        System.out.println("is is a file? " + file.isFile());
        System.out.println("is it a directory? " + file.isDirectory());

        // reutns a list of all file NAMES
        String[] name = file.list();

        try {
            for (String n : name)
                System.out.println(n);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(file.lastModified());

        // Returns all files -> can read and write on this files. Actual file is
        // returned
        File[] files = file.listFiles();
        try {
            for (File file1 : files) {
                System.out.println("FIles or folder: " + file1.getName());
            }
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

        File newfile = new File("C:\\Users\\hp\\Documents\\7051\\CSW-2\\Files\\Test2.txt");
        file.renameTo(newfile);
        System.out.println("New file name: " + newfile.getName());
    }
}

/*
 * exists()
 * createNewFile()
 * canRead()
 * canWrite()
 * getAbsolutePath()
 * isFile()
 * isDirectory()
 * delete()
 * ======
 * list() --> returns an array of string(if directly printed it will print null)
 * String[] name=file.list();
 * if the list is empty it throws null pointer exception --> wrap inside try and
 * catch
 * 
 * lastModified()
 * listFiles()
 * renameTo()
 */
