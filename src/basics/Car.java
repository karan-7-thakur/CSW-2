//implentation of high cohesion and low coupling.
package basics;

interface CarDemo {
    public void printCar();
}

class PetrolCar implements CarDemo{
    public void printCar(){
        System.out.println("This is a Petrol Car");
    }
}
class DieselCar implements CarDemo{
    public void printCar(){
        System.out.println("This is a Petrol Car");
    }
}

public class Car {
    static void display(){
        CarDemo mercedez = new PetrolCar();
        mercedez.printCar();
        CarDemo toyota = new DieselCar();
        toyota.printCar();
    }

    public static void main(String[] args) {
        display();
    }
}