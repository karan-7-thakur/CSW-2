package assign3;

public class AS3Q6 {

    static void sort(int[] arr) {
        try {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println(" The array is null.");
        }
    }

    static int search(int ele, int[] arr) {
        try {
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ele) {
                    index = i;
                    break;
                }
            }
            return index;
        } catch (NullPointerException e) {
            throw new NullPointerException();

        }

    }

    static int get(int index, int[] arr) {
        try {
            return arr[index];

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Index not in range");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 3, 4, 5, 6, 7 };
        try {
            sort(arr);
            System.out.println("sorted");
            search(10, arr);
            System.out.println("Searched");
            get(10, arr);
            System.out.println("Accessed");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
