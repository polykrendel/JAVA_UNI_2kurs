package app;

import vehicles.*;
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Honda Element", "sus69", "Sky_Blue", 2015,
                "Pups", "INS123456789");
        ElectricCar electricCar1 = new ElectricCar("Toyota Prius", "GaycaR", "White",
                2022, "Oleg", "ELEC987654321", 40);
        System.out.println("Car 1: " + car1);
        System.out.println("Electric Car 1: " + electricCar1);
        car1.setYear(2018);
        System.out.println("Обновление года Car 1: " + car1.getYear());
        electricCar1.setInsuranceNumber("ROFLYAN");
        System.out.println("Обновление страхового номера Electric Car 1: " +
                electricCar1.getInsuranceNumber());
        System.out.println("Тип двигателя Electric Car 1: " +
                electricCar1.getEngineType());
        car1.setOwnerName("Bob");
        System.out.println("Обновлено имя владельца Car 1: " +
                car1.getOwnerName());
        electricCar1.setBatteryCapacity(50);
        System.out.println("Обновленная емкость аккумулятора Electric Car 1: " +
                electricCar1.getBatteryCapacity() + " kWh");
    }
}
