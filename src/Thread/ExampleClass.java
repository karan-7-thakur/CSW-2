package Thread;

public class ExampleClass extends Thread{

    int count=0;
    // This code will be shared by all methods is common for all thread objects
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("This is Thread"+Thread.currentThread().getName());
            count++;
            
        }
    
    }

    public static void main(String[] args) {
        ExampleClass th1 = new ExampleClass();
        ExampleClass th2 = new ExampleClass();

        th1.start();
        th2.start();

    }
    
}
