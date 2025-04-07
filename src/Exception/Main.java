package Exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt"); // "C:\\Users\\hp\\Desktop\\New Text Document"
        FileReader readFile = new FileReader(file);
        /*
         * try{
         * }catch (FileNotFoundException e){
         * System.out.println(e);
         * }
         */
    }
}