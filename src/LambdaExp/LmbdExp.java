package LambdaExp;
import java.util.function.Consumer;

public class LmbdExp {

    // Is a method that takes a functional Interface as the input 
    public static void print(Consumer<Integer> con){
        con.accept(5);
    }

    public static void main(String[] args) {

        // passing the lamda expression to a function Excepting funcational interface
        print((var)->System.out.println(var));

        print(System.out::println);   // Method refrenceing does the same things as previous
        
        
    }
    
}
