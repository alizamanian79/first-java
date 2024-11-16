package ParkingProgram;

import java.util.ArrayList;

class Parking {
    protected int id;
    protected String name, address;
    private ArrayList<String> carList = new ArrayList<>();


    public Parking(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public void addCar(String car) {
        carList.add(car);
    }


    public void getCarList() {
        System.out.println("Cars in parking: " + carList);
    }
}

class Car {
    private Person owner;
    protected double fee;
    protected int hours;


    public Car(Person owner, double fee, int hours) {
        this.owner = owner;
        this.fee = fee;
        this.hours = hours;

    }



    public double calculateFee() {
        return fee * hours;
    }

    public String getCarDetails() {
        return "Owner: " + owner.getName() + ", Car: " + owner.getCar() + ", Fee: " + calculateFee();
    }
}

class Person {
    private String name;
    private String car;


    public Person(String name, String car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getCar() {
        return car;
    }
}

public class ParkingProgram {
    public static void main(String[] args) {

        Person person1 = new Person("Ali", "Pride");
        Car car1 = new Car(person1, 5.0, 3);
        Parking parking = new Parking(1, "Hovita", "Tarasht");
        parking.addCar(car1.getCarDetails());
        parking.getCarList();
    }
}
