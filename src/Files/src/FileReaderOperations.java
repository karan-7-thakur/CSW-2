//FileReaderOperations.java
package Files.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderOperations {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\hp\\Documents\\7051\\CSW-2\\Files\\dir\\ReadWrite.txt");
        System.out.println("File is there: " + file.exists());
        // File creation
        try {
            if (file.createNewFile())
                System.out.println("File Created!");
            else
                System.out.println("The file is there!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        // Writing file using FileWriter
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true); // second parameter is optional (by default it will overwrite the
                                                 // file), true--> it will not override
            writer.write("This is new addition!!!\n");
            writer.write("regvrdgrfgv");
            writer.close(); // otherwise writer will not work
        } catch (IOException e) {
            System.out.println("Error writng the file: " + e.getMessage());
        }

        // Reading file using FileReader
        try {
            FileReader reader = new FileReader(file);
            try {
                int ch;
                while ((ch = reader.read()) != -1) {
                    System.out.print((char) ch);
                }
                reader.close(); // THis may cause problem as if there is any error during while loop it will not
                                // close FileReader
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

    }
}

/*
 * reader.read(); --> returns an integer (it throws an IO exception )
 * writer.write(); --> it also throws IOException
 * ==because we wrote IOException for
 * "FileWriter writer = new FileWriter(file);"
 * so it is not showing error for "writer.write("This is me Kaushik!!!");" -->
 * but it throws IOException so write a nested trycatch for it==
 * for FileWriter you must close it writer.close() --> otherwise it will not
 * write
 */
