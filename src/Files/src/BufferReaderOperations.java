// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.WriteAbortedException;
// import java.nio.Buffer;

// public class BufferReaderOperations {
// public static void main(String[] args) {
// File file = new File("C:\\Users\\hp\\Desktop\\LibraryManagementSystem.txt");
// System.out.println("File is there: " + file.exists());
// // File crgtrshyhyzeation

// try {
// if (file.createNewFile())
// System.out.println("File Created!");
// else
// System.out.println("The file is there!");
// } catch (IOException e) {
// System.err.println(e.getMessage());
// }

// // Writing file using FileWriter
// // FileWriter writer = null;
// BufferedWriter bufferWriteFile = null;
// try {
// bufferWriteFile = new BufferedWriter(file);
// writer.write("This is new addition!!!");
// writer.close(); // shifted to finally block
// } catch (IOException e) {
// System.out.println("Error writng the file: " + e.getMessage());
// } finally {
// try {
// // writer.close();
// } catch (IOException e) {
// System.out.println(e);
// }
// }

// // Reading file using FileReader
// // FileReader reader = null;
// BufferedReader bufferReadFile = null;
// try {
// bufferReadFile = new BufferedReader(new FileReader(file));
// try {
// String ch;
// while ((ch = bufferReadFile.readLine()) != null) {
// System.out.print(ch);
// }
// bufferReadFile.close();
// } catch (IOException e) {
// System.out.println(e.getMessage());
// }
// } catch (FileNotFoundException e) {
// System.err.println("Error reading the file: " + e.getMessage());
// }

// }
// }

// /*
// * reader.read(); --> returns an integer (it throws an IO exception )
// * writer.write(); --> it also throws IOException
// * ==because we wrote IOException for
// * "FileWriter writer = new FileWriter(file);"
// * so it is not showing error for "writer.write("This is me Kaushik!!!");" -->
// * but it throws IOException so write a nested trycatch for it==
// * for FileWriter you must close it writer.close() --> otherwise it will not
// * write
// */