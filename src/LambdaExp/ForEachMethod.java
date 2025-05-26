package LambdaExp;
import java.util.ArrayList;
import java.util.List;



public class ForEachMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mondstat");
        list.add("Liyiue");
        list.add("Inazuma");

        list.forEach((var)->System.out.println(var));  // Here forEach: takes a consuer interface (Functionl) and call accept
                                                        // Basically it applies the lamda Expression/Interface instance to all the elements of the list

        list.sort((x,y)-> { 
            return x.length() - y.length();        // Sort here takes a comparator instance/Lamda expression to ovveride compareTo method.
            // return Integer.compare(x.length(), y.length());
        });

        System.out.println(list);
    }
}
