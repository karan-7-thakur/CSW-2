package assign4;

class NullifiedReference {

    String name;

    public NullifiedReference(String name) {
        this.name = name;
    }

    @Override
    public void finalize() {
        System.out.println("Cleared object: " + name);

    }

}

public class AS4Q3 {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory: " + runtime.totalMemory() / (1024.0 * 1024) + "MB");
        System.out.println("Free Memory before object creation: " + runtime.freeMemory() / (1024.0 * 1024) + "MB");

        NullifiedReference ref1 = new NullifiedReference("Null-1");
        ref1 = null;
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Free Memory after object creation: " + runtime.freeMemory() / (1024.0 * 1024) + "MB");

    }
}
