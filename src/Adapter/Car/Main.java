package Adapter.Car;

import Adapter.Car.Adapters.CarAdapater;
import Adapter.Car.Services.Car;

public class Main {

    public static void main(String[] args) throws Exception {
        IStatistics firstCar = new CarAdapater(new Car(80, 23));
        IStatistics secondCar = new CarAdapater(new Car(40, 30));

        System.out.println("Speed: " + firstCar.measureSpeed());
        System.out.println("Temperature: " + firstCar.measureTemperature());
        System.out.println("Speed: " + secondCar.measureSpeed());
        System.out.println("Temperature: " + secondCar.measureTemperature());
    }
}
