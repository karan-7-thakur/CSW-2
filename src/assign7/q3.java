package assign7;

import java.util.ArrayList;

public class q3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Amy");
        list.add("Jonathan");
        list.add("Sue");
        list.add("Michael");

        list.sort((str1, str2) -> str1.length() - str2.length());
        list.forEach(System.out::println);

    }
}
