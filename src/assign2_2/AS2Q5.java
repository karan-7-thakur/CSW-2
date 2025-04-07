package assign2_2;

import java.util.HashMap;
import java.util.Map;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

}

class Library {
    private HashMap<Integer, Book> books;

    public Library() {
        books = new HashMap<>();

    }

    void addBook(int id, Book b) {
        if (!books.containsKey(id)) {
            books.put(id, b);
        } else {
            System.out.println("Book with id " + id + " already exists");
        }
    }

    void removeBook(int id) {
        if (books.containsKey(id)) {
            books.remove(id);
            System.out.println("Book with id " + id + " removed");
        } else {
            System.out.println("Book with id " + id + " does not exist");
        }
    }

    void print() {
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println(
                    entry.getKey() + " | " + entry.getValue().getName() + " : " + entry.getValue().getAuthor());
        }
    }

}

public class AS2Q5 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(1, new Book(1, "Fire and Blood", "RR Martin", 10));
        lib.addBook(2, new Book(2, "Outlander", "Diana Gaboldan", 20));
        lib.print();

        lib.removeBook(2);
        lib.print();

    }

}
