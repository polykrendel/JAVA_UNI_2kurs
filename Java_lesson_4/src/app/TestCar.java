package app;
import vehicles.*;

public class TestCar {
    public static void main(String[] args) {
        Car car=new Car("Ford RS200 Evolution", "ab0ba", "Черный", "Dzerzh",
                "Petrol", 1985, 12345);
        ElectricCar ecar=new ElectricCar("BMW I3", "gasl0l", "Белый",
                "Antoshka", 2018, 55555, 42);

        System.out.println(car);
        System.out.println(ecar);

        car.setInsuranceNumber(99099);
        car.setYear(1986);

        ecar.setBatteryCapacity(60);
        ecar.setOwnerName("Dickens");

        System.out.println(car);
        System.out.println(ecar);
    }
}