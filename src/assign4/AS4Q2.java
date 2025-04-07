package assign4;

class ReassignReference {

    String name;

    public ReassignReference(String name) {
        this.name = name;
    }

    @Override
    public void finalize() {
        System.out.println("Cleared object: " + name);

    }

}

public class AS4Q2 {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory: " + runtime.totalMemory() / (1024.0 * 1024) + "MB");
        System.out.println("Free Memory before object creation: " + runtime.freeMemory() / (1024.0 * 1024) + "MB");

        ReassignReference ref1 = new ReassignReference("Saket");
        ReassignReference ref2 = new ReassignReference("Aryan");
        ref2 = ref1;

        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Free Memory after object creation: " + runtime.freeMemory() / (1024.0 * 1024) + "MB");

    }
}
