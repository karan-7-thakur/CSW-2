package assign3;

public class AS3Q1 {

    static String getNum(String str) {
        if (str == null || str.length() == 0) {
            throw new NullPointerException("Cant have empty or null string");
        }
        String nums = "";

        for (int i = 0; i < str.length(); i++) {
            // if (str.charAt(i) < 57 & str.charAt(i) > 48) {
            // nums += str.charAt(i);
            // }

            if (Character.isDigit(str.charAt(i))) {
                nums += str.charAt(i);

            }

        }

        return nums;

    }

    public static void main(String[] args) throws NullPointerException {

        String str = new String("");
        System.out.println(getNum(str)); // prints 123

    }
}
