package assign3;

import java.util.Arrays;

public class Q7 {

    static void addMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] ans = new int[matrixA.length][matrixB.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                ans[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Addition of the matrix is");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mulitplyMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] ans = new int[matrixA.length][matrixB.length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB.length; j++) {
                for (int k = 0; k < matrixA.length; k++) {
                    ans[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("\nMultiplication of the matrix is");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrixA = {
                { 1, 2, 3 },
                { 2, 5, 6 },
                { 8, 4, 1 }
        };
        int[][] matrixB = {
                { 1, 2, 3 },
                { 2, 5, 6 },
                { 8, 4, 1 }
        };
        try {
            addMatrix(matrixA, matrixB);
            mulitplyMatrix(matrixA, matrixB);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
