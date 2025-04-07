class Car {
    private String make;
    private String model;

    public Car() {
        this.make = null;
        this.model = null;

    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void print() {
        System.out.println("{Car: " + model + " " + make + " }");
    }

}

public class CarTester {

    public static void main(String[] args) {
        Car myCar1 = new Car("1965", "BMW");
        Car myCar2 = new Car();
        myCar1.print();
        myCar2.print();

        myCar2.setModel("Ferrari");
        myCar2.setMake("1967");

        myCar1.print();
        myCar2.print();

    }
}