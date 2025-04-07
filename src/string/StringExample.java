package string;

public class StringExample {

    public static void main(String[] args) {
        // String Literal
        String str = "Hello";
        String str1 = "Hello";
        System.out.println(str == str1); // true
        System.out.println("str hash code: " + System.identityHashCode(str));
        System.out.println("str 1 hash code: " + System.identityHashCode(str1));

        String str2 = new String("Hello");
        String str3 = new String("Hello");
        System.out.println(str2 == str3); // false: different memory location
        System.out.println(str2.equals(str3));
        System.out.println("str 2 hash code: " + System.identityHashCode(str2));
        System.out.println("str 3 hash code: " + System.identityHashCode(str3));

        // Concatination
        // + : preffered, => Multiple concta, different data types
        // .concat(), => single concat, sinfle data types
        System.out.println(str1 + str2 + str3);
        System.out.println(str.concat(str2).concat(str3));

        // String Builder & StringBuffer--------------
        System.out.println("------String Builder --------");
        StringBuilder sb = new StringBuilder("Hello");
        // StringBuffer sb = new StringBuffer("Hello");
        sb.append(515);
        System.out.println(sb);
        sb.delete(5, 8);
        sb.deleteCharAt(0);

        System.out.println(sb);

        // Replace the entire string after strat
        sb.replace(0, 3, "tree");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.capacity());

    }
}
