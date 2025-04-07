## READ A FILE

filepath: "C:\\Users\\hp\\Documents\\7051\\CSW-2\\Files\\src\\App.java"

Have to add double slashs. They act as excape sequence in java

# Java File Handling - Detailed Notes

## 1. Introduction to File Handling in Java

File handling in Java is done using classes from the `java.io` package. It enables reading from and writing to files stored on a disk.

Key classes involved:

- `File`
- `FileReader`
- `FileWriter`
- `BufferedReader`
- `BufferedWriter`

## 2. File Class and Basic File Operations

The `File` class is used to represent file and directory pathnames. It provides methods to check properties and manipulate files.

### Creating a File

```java
File file = new File("C:\\Users\\hp\\Documents\\Test.txt");
try {
    boolean status = file.createNewFile();
    System.out.println("File is created: " + status);
} catch (IOException e) {
    System.err.println(e.getMessage());
}
```

- `createNewFile()`: Creates a new empty file if it does not exist.
- `exists()`: Checks if the file exists.
- `canRead()`, `canWrite()`: Check read and write permissions.
- `delete()`: Deletes the file.

### File Properties

```java
System.out.println("Read Permission: " + file.canRead());
System.out.println("Write Permission: " + file.canWrite());
System.out.println("File Path: " + file.getAbsolutePath());
System.out.println("Is File? " + file.isFile());
System.out.println("Is Directory? " + file.isDirectory());
```

- `getAbsolutePath()`: Returns the file’s absolute path.
- `isFile()`, `isDirectory()`: Checks if it's a file or directory.

## 3. Writing to a File

### Using FileWriter

```java
try (FileWriter writer = new FileWriter(file, true)) {
    writer.write("This is new addition!!!\n");
} catch (IOException e) {
    System.out.println("Error writing the file: " + e.getMessage());
}
```

- `FileWriter(file, true)`: Appends data if `true` is passed.
- Always close the `FileWriter` after writing (`writer.close()`).
- If `false` is passed (default), the file is overwritten.

## 4. Reading from a File

### Using FileReader

```java
try (FileReader reader = new FileReader(file)) {
    int ch;
    while ((ch = reader.read()) != -1) {
        System.out.print((char) ch);
    }
} catch (IOException e) {
    System.out.println("Error reading the file: " + e.getMessage());
}
```

- `read()`: Reads character by character and returns an integer.
- Always close the `FileReader` after reading.

## 5. BufferedReader and BufferedWriter

Buffered streams are used to improve efficiency by reading and writing in chunks.

### Writing with BufferedWriter

```java
try (BufferedWriter bufferWriteFile = new BufferedWriter(new FileWriter(file))) {
    bufferWriteFile.write("This is a new addition!!!\n");
} catch (IOException e) {
    System.out.println("Error writing the file: " + e.getMessage());
}
```

### Reading with BufferedReader

```java
try (BufferedReader bufferReadFile = new BufferedReader(new FileReader(file))) {
    String line;
    while ((line = bufferReadFile.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.err.println("Error reading the file: " + e.getMessage());
}
```

- `readLine()`: Reads a whole line instead of single characters.
- `BufferedWriter` should always be closed to ensure data is written.

## 6. Directory Operations

### Checking Directory Properties

```java
File dir = new File("C:\\Users\\hp\\Documents\\CSW-2\\Files");
System.out.println("Exists: " + dir.exists());
System.out.println("Is Directory? " + dir.isDirectory());
```

### Listing Files in a Directory

```java
String[] files = dir.list();
if (files != null) {
    for (String fileName : files) {
        System.out.println(fileName);
    }
} else {
    System.out.println("No files found.");
}
```

- `list()`: Returns an array of filenames.
- `listFiles()`: Returns an array of `File` objects.

### Renaming a File

```java
File newfile = new File("C:\\Users\\hp\\Documents\\Test2.txt");
file.renameTo(newfile);
System.out.println("New file name: " + newfile.getName());
```

- `renameTo(newfile)`: Renames the file.

## 7. Exception Handling in File Operations

### Common Exceptions:

- `IOException`: General file handling errors.
- `FileNotFoundException`: File does not exist.
- `NullPointerException`: Occurs when working with empty directories.

### Example with Exception Handling

```java
try {
    FileReader reader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(reader);
    String line;
    while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
    }
    bufferedReader.close();
} catch (FileNotFoundException e) {
    System.err.println("File not found: " + e.getMessage());
} catch (IOException e) {
    System.err.println("Error reading file: " + e.getMessage());
}
```

## 8. Summary of Key Methods

| Method                      | Description                       |
| --------------------------- | --------------------------------- |
| `exists()`                  | Checks if file/directory exists   |
| `createNewFile()`           | Creates a new file                |
| `delete()`                  | Deletes a file                    |
| `canRead()`, `canWrite()`   | Checks permissions                |
| `isFile()`, `isDirectory()` | Checks type                       |
| `getAbsolutePath()`         | Gets full file path               |
| `list()`                    | Returns file names in a directory |
| `listFiles()`               | Returns `File` objects            |
| `renameTo(newFile)`         | Renames a file                    |
| `read()`, `readLine()`      | Reads from a file                 |
| `write()`                   | Writes to a file                  |
| `close()`                   | Closes file streams               |

---

These notes summarize all key concepts related to file handling in Java based on the provided Java files and comments.
