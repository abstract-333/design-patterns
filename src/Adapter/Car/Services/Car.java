package Adapter.Car.Services;

public class Car {
    private double speed;
    private double temperature;

    public Car(double speed, double temperature) {
        this.speed = speed;
        this.temperature = temperature;
    }

    public double measureTemperature() {
        return temperature;
    }

    public double measureSpeed() {
        return speed;
    }
}
