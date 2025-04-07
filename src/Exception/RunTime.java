package Exception;

public class RunTime {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        try {
            Object num = "number";
            int number = (Integer) num;
            String a = null;
            System.out.println(a.charAt(0));
            System.out.println(10 / 0);
            String str = new String("Hello");
            System.out.println(str.charAt(10));
            System.out.println(arr[6]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e);
        }
    }
}
