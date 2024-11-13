package ParkingProgram;

import java.util.ArrayList;

public class ParkingPG {




    public static void main(String[] args ,Parking parking) {

        Parking car1 = new Car(14, "Tehran", "Hovita parking",
                88, "206", 520, 1, 2);
        parking.setCarsList(((Car) car1).getCarType());
        car1.getCar();

        // Call checkParking with car1
        System.out.println(parking.getCarsList());
    }
}

abstract class Parking {
    protected int parkingId;
    protected String parkingAddress, name;
    protected ArrayList<String> carsList = new ArrayList<String>();

    public Parking(int parkingId, String parkingAddress, String name) {
        this.parkingId = parkingId;
        this.parkingAddress = parkingAddress;
        this.name = name;
    }

    public void setCarsList(String value) {
        this.carsList.add(value);
    }

    public ArrayList<String> getCarsList() {
        return carsList;
    }


    protected void list() {
        System.out.println(getCarsList());
    }

    abstract void getCar();
}

class Car extends Parking {
    protected int carId;
    protected String carType;
    protected int carPrice;
    protected int fee;
    protected int hour;

    public Car(int parkingId, String parkingAddress, String name, int carId, String carType, int carPrice, int fee, int hour) {
        super(parkingId, parkingAddress, name);
        this.carId = carId;
        this.carType = carType;
        this.carPrice = carPrice;
        this.fee = fee;
        this.hour = hour;
    }

    public int payment() {
        return (int) (this.carPrice / (this.fee * this.hour));
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    void getCar() {
        System.out.println("Parking id : \t" + parkingId);
        System.out.println("Parking name : \t" + name);
        System.out.println("Parking address : \t" + parkingAddress);
        System.out.println("Car : \t" + carType);
        System.out.println("Car Price : \t" + carPrice);
        System.out.println("Fee : \t" + fee);
        System.out.println("Payment : \t" + payment());
    }
}
