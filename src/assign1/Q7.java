
abstract class LibraryResources {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LibraryResources(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void displayDetails();

}

class Book extends LibraryResources {
    private int pageCount;
    private String issueDate;
    private int duation;

    public Book(String title, String author, int pageCount, String issueDate, int duration) {
        super(title, author);
        this.duation = duration;
        this.pageCount = pageCount;
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title:" + getTitle());
        System.out.println("Author:" + getAuthor());
        System.out.println("Page Count:" + pageCount);
        System.out.println("Issue Date:" + issueDate);
        System.out.println("Duration:" + duation);

    }

}

public class Q7 {
    public static void main(String[] args) {

        LibraryResources book = new Book("FIRE AND BLOOD", "G.R.R. Martin", 900, "2019", 60);
        book.displayDetails();
    }
}
