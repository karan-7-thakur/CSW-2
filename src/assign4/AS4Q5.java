package assign4;

class InnerClass {

    private int intNum;
    private double doubleNum;
    int[] arr;

    public int getIntNum() {
        return intNum;
    }

    public void setIntNum(int intNum) {
        this.intNum = intNum;
    }

    public double getDoubleNum() {
        return doubleNum;
    }

    public void setDoubleNum(double doubleNum) {
        this.doubleNum = doubleNum;
    }

    public InnerClass(int intNum, double doubleNum) {
        this.intNum = intNum;
        this.doubleNum = doubleNum;
        this.arr = new int[1000000];
    }

}

public class AS4Q5 {

    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("Total Memory: " + run.totalMemory() / (1024.0 * 1024) + "MB");
        System.out.println("Free Memory: " + run.freeMemory() / (1024.0 * 1024) + "MB");

        InnerClass obj1 = new InnerClass(101000000, 10.20);
        InnerClass obj2 = new InnerClass(10, 10.20);
        InnerClass obj3 = new InnerClass(10, 10.20);
        InnerClass obj4 = new InnerClass(Integer.MAX_VALUE, 10.20);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Free Memory after object creation : " + run.freeMemory() / (1024.0 * 1024)
                + "MB");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        obj2 = null;
        obj3 = null;
        obj4 = obj1;
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Free Memory after garbage creation (After gc) : " + run.freeMemory() / (1024.0 * 1024)
                + "MB");

        // System.gc();
        // {
        //     Thread.sleep(2000);
        // tch (InterruptedException e) {
        //     System.out.println(e);
        // }
        // 
        // System.out.println("Free Memory after object creation: " + run.freeMemory() / (1024.0 * 1024) + "MB");
    }
}
