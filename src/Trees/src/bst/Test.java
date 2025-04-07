package Trees.src.bst;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();

        int[] arr = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        test.pushZerosToEnd(arr);

        System.out.println("\nArray after pushing zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    void pushZerosToEnd(int[] arr) {
        int nonZeroPointer = 0;

        for (int i = 0; i < arr.length; i++) {
            // non zero element
            if (arr[i] != 0) {
                // swap the value with the nonZeroPoniter
                int temp = arr[i];
                arr[i] = arr[nonZeroPointer];
                arr[nonZeroPointer] = temp;
                nonZeroPointer++;
            }

        }
    }
}