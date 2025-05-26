package LambdaExp;
// Functional Interface : One with only one abstract methods
interface FunctionalInterface1{
    // public void operation(int a, int b);

    // public void operation2();

    public int operation3(int a, int b);

    default void display(){
        System.out.println("This is the Interface");
    }
}

public class LambdaExpression1 {

    // Takes a interface function and call its method
    public static void print(FunctionalInterface1 fun){

        System.out.println(fun.operation3(10, 5));
    };

    public static void main(String[] args) {

        /*
         * Anonymous class
         */
        // FunctionalInterface1 obj = new FunctionalInterface1() {
        //     @Override                                            
        //     public void operation(int a, int b) {
        //         System.out.println(a+b);
        //     }
        // };
        // obj.operation(5,6);

        /*
         * Lambda Expression -> with 2 parameter and no return
         */

        // FunctionalInterface1 obj1 = (x, y) -> {          // Note: can write just x, y also without datatype
        //     System.out.println(x+y);
        // };

        /*
         * Lambda Expression -> without parameter
         */

        //  FunctionalInterface1 f1 = ()->{
        //     System.out.println("No parameter");
        //  };

        // f1.operation2();

        /*
         * Lambda Exp -> with return and final scope
         */
        int scope = 10;
        FunctionalInterface1 f1 = (x,y)->{
            System.out.println(scope);
            // scope = 11;   // Note: Any variable inside LambdaExp = Effectively Final cant change the value
            return (x+y);
        };

        
        print((x,y)->{
            return x+y;         // here the interface is ovveridden without an interface object
        });
    }
}
