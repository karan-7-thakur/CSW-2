
// public void sum(Object obj1, Object obj2){
//     System.out.println(obj1+obj2);               // Error Not Type Safe
// }

// ---------------------------------
// 1. Generic Class
// 2. Generic Method
package basics;

class GenericClass<T, E> {

    T var;
    E var2;

    public GenericClass(T var, E var2) {
        this.var = var;
        this.var2 = var2;
    }

    public void print() {
        System.out.println(var);
        System.out.println(var2);
    }

    // not a generic method
    public T getNum() {
        return var;
    }

    public <V extends Number> void sum(V num1, V num2) {
        System.out.println(num1.doubleValue() + num2.doubleValue()); /// type error not compartibale for object + object
    }

}

class Main {
    public static void main(String[] args) {
        GenericClass<Integer, String> obj1 = new GenericClass<>(10, "Hello");
        obj1.print();

        int num = obj1.getNum();

        // toString() Method -----------------------------
        System.out.println(obj1);
        System.out.println(obj1.toString());
        obj1.sum(10, 20);

    }

}
