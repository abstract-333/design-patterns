package Adapter.Car.Adapters;

import Adapter.Car.IStatistics;
import Adapter.Car.Services.Car;

public class CarAdapater implements IStatistics {
    private Car adaptee;

    public CarAdapater(Car instance) {
        this.adaptee = instance;
    }

    @Override
    public double measureSpeed() {
        return 1.6 * adaptee.measureSpeed();
    }

    @Override
    public double measureTemperature() {
        return 0.55 * (adaptee.measureTemperature() - 32);
    }

}
