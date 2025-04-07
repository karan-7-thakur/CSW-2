package assign4;

class Student {

    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public void finalize() {
        System.out.println("Finalize method called" + this.name + this.id);
    }

}

public class AS4Q7 {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory: " + runtime.totalMemory() / (1024.0 * 1024) + "MB");
        System.out.println("Free Memory: " + runtime.freeMemory() / (1024.0 * 1024) + "MB");

        Student s1 = new Student("Rand al' Thor'", "1");
        Student s2 = new Student("Matrim Cauthon", "2");
        Student s3 = new Student("Nynaeve al'Meara", "3");
        Student s4 = new Student("Perrin Aybara", "4");

        s2 = null;
        s3 = null;
        s4 = null;
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Free Memory after garbage creation (After gc) : " + runtime.freeMemory() / (1024.0 * 1024)
                + "MB");

    }
}
