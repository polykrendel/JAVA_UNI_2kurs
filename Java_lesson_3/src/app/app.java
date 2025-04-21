package app;

import vehicles.*;

public class app {
    public static void main(String[] args) {
        Car car=new Car();
        ElectricCar ecar=new ElectricCar();

        System.out.println("Машина:");
        car.setEngineType("Petrol");
        System.out.println("Тип двигателя: "+car.getEngineType());
        car.setOwnerName("Will Smith");
        System.out.println("Имя владельца: "+car.getOwnerName());
        car.setInsuranceNumber(22869);
        System.out.println("Номер страховки: "+car.getInsuranceNumber());

        System.out.println("Электрическая машина:");
        System.out.println("Тип двигателя: "+ecar.getEngineType());
        ecar.setOwnerName("Jason Stetham");
        System.out.println("Имя владельца: "+ecar.getOwnerName());
        ecar.setInsuranceNumber(123321);
        System.out.println("Номер страховки: "+ecar.getInsuranceNumber());
        ecar.setBatteryCapacity(70);
        System.out.println("Емкость батареи: "+ecar.getBatteryCapacity() + "kW/h");
    }
}