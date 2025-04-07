package assign2_2;

import java.util.PriorityQueue;
import java.util.Queue;

public class AS2Q11 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 10, 8, 7, 3, 4, 6, 5, 9 };

        Queue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
        }

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}
