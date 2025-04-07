package string.practice;

public class Practice_Q1 {
    public static void main(String[] args) {
        String str = "";
        long start, end;

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        end = System.nanoTime();
        System.out.println("Execution time using String = " + (end - start) + "ns");
        // System.out.println("String = " + str);

        start = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            buffer.append(i);
        }
        end = System.nanoTime();
        System.out.println("Execution time using StringBuilder = " + (end - start) + "ns");
        // System.out.println("Buffer = " + buffer);
    }
}
