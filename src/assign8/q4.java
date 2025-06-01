package assign8;

import java.util.Arrays;

class MatrixMulThread extends Thread {
    int[][] a, b, result;
    int i;

    public MatrixMulThread(int[][] a, int[][] b, int[][] result, int i) {
        this.a = a;
        this.b = b;
        this.result = result;
        this.i = i;
    }

    @Override
    public void run() {
        for (int j = 0; j < b[0].length; j++) {
            result[i][j] = 0;
            for (int k = 0; k < a[0].length; k++) {
                result[i][j] += a[i][k] * b[k][j];
            }
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int[][] B = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };

        int[][] result = new int[A.length][B[0].length];

        MatrixMulThread[] threads = new MatrixMulThread[A.length];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MatrixMulThread(A, B, result, i);
            threads[i].start();
            try {
                threads[i].join();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(Arrays.deepToString(A));
        System.out.println(Arrays.deepToString(B));
        System.out.println(Arrays.deepToString(result));

    }
}
