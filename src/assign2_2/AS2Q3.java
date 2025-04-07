package assign2_2;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int modelNo;
    private String name;
    private int stock;

    Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    @Override
    public int compareTo(Car obj2) {
        return this.stock - obj2.stock;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

class CarApp {
    private ArrayList<Car> cars;

    CarApp() {
        cars = new ArrayList<Car>();
    }

    void addCars(Car c) {
        cars.add(c);
    }

    void sort() {
        Collections.sort(cars);
    }

    void print() {
        for (Car car : cars) {
            System.out.println(car.getName() + " " + car.getModelNo() + " " + car.getStock());
        }

    }

}

public class AS2Q3 {
    public static void main(String[] args) {
        CarApp app = new CarApp();
        app.addCars(new Car(2013, "Creta", 10));
        app.addCars(new Car(2020, "MG", 13));
        app.addCars(new Car(2018, "kia", 20));
        app.addCars(new Car(2017, "Audi", 45));
        app.addCars(new Car(2015, "BMW", 55));

        app.sort();
        app.print();

    }
}
