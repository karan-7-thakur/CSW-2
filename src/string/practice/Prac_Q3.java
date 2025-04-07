package string.practice;

public class Prac_Q3 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("123");
        str.append("45");
        str.insert(5, "6");
        str.delete(2, 4);
        str.reverse();
        System.out.println(str);
    }
}
