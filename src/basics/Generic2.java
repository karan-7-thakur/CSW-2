package basics;

class GenericsArray<T> {

    T[] arr;

    public GenericsArray(T[] arr) {
        this.arr = arr;
    }

    public void print() {
        System.out.print("[ ");
        for (T t : arr) {
            System.out.print(t + ", ");

        }
        System.out.println("]");

    }

    public int search(T target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;

            }

        }

        return -1;
    }

}

public class Generic2 {
    public static void main(String[] args) {
        // Integer[] arr1 = { 1, 2, 3, 4, 5, 6 };
        String[] arr2 = { "name", "hello", "hi" };

        GenericsArray<String> ob1 = new GenericsArray<>(arr2);
        // GenericsArray<String> ob2 = new GenericsArray<>(arr2);

        ob1.print();
        // ob2.print();

        System.out.println("Index:" + ob1.search("name"));

    }

}
