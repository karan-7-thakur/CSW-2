package string;

public class Example {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        long start, end;
        start = System.nanoTime();

        for (int i = 1; i <= 100; i++) {
            builder.append(i);
        }
        end = System.nanoTime();
        System.out.println("Total execution time (Builder): " + (end - start) + "ns");
        System.out.println(builder);

        start = System.nanoTime();
        StringBuffer buffer = new StringBuffer("Hello");
        for (int i = 1; i <= 100; i++) {
            buffer.append(i);
        }
        end = System.nanoTime();
        System.out.println("Total execution time (Buffer): " + (end - start) + "ns");
        System.out.println(buffer);
    }
}
