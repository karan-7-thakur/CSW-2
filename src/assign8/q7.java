package assign8;

import java.util.ArrayList;
import java.util.List;

class prime {
    int start, end;
    List<Integer> result;

    public prime(int start, int end, ArrayList<Integer> result) {
        this.start = start;
        this.end = end;
        this.result = result;
    }

    public void allPrimes() {
        for (int i = start; i < end; i++) {
            if (isPime(i)) {
                synchronized (this) {
                    result.add(i);
                }
            }
        }
    }

    public boolean isPime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class q7 {

    public static void main(String[] args) {

        int start = 0, end = 50;
        ArrayList<Integer> result = new ArrayList<>();
        int noThread = 4;

        Thread[] thread = new Thread[noThread];

        int range = (end - start) / noThread;

        for (int i = 0; i < noThread; i++) {
            int s = start;
            int e = start + range;

            thread[i] = new Thread(() -> {
                prime p = new prime(s, e, result);
                p.allPrimes();
                return;
            });

            start = e;

            thread[i].start();

            try {
                thread[i].join();
            } catch (Exception error) {
                System.out.println(error);
            }

        }

        result.sort((x, y) -> Integer.compare(x, y));
        System.out.println(result);
    }

}
