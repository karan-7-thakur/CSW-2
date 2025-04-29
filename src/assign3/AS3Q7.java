package assign3;

public class AS3Q7 {

    static void printMatrix(int[][] matrix, String message) {
        System.out.println("\n" + message);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] ans = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                ans[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        printMatrix(ans, "Addition of the matrix is");
    }

    static void mulitplyMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] ans = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    ans[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        printMatrix(ans, "Multiplication of the matrix is");
    }

    static void transposeMatrix(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        printMatrix(transposed, "Transpose of the matrix is");
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
            transposeMatrix(matrixB);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
