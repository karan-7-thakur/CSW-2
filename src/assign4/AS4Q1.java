package assign4;


class UnreachableObject {

    String name;

    public UnreachableObject(String name) {
        this.name = name;
    }

    public void show() {
        UnreachableObject obj = new UnreachableObject("Child 1 : ");
        obj.display();

    }

    public void display() {
        System.out.println(name);
        UnreachableObject obj2 = new UnreachableObject("Child 2: ");
    }

    @Override
    public void finalize() {
        System.out.println("Cleared object: " + name);

    }

}

public class AS4Q1 {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory: " + runtime.totalMemory() / (1024.0 * 1024) + "MB");
        System.out.println("Free Memory before object creation: " + runtime.freeMemory() / (1024.0 * 1024) + "MB");
        UnreachableObject obj = new UnreachableObject("HEllo");

        obj.show();

        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Free Memory after object creation: " + runtime.freeMemory() / (1024.0 * 1024) + "MB");

    }
}
