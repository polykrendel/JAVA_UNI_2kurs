package vehicles;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String model,String license,String color,String ownerName,int year,int insuranceNumber,int batteryCapacity){
        setInsuranceNumber(insuranceNumber);
        setOwnerName(ownerName);
        setColor(color);
        setLicense(license);
        setYear(year);
        setModel(model);
        this.batteryCapacity=batteryCapacity;
        this.engineType="Electric";
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }

    public String vehicleType(){
        return "Electric Car";
    }

    @Override
    public String toString(){
        return vehicleType() +" {model: " + getModel() +
                ", license: " + getLicense() +
                ", color: " + getColor() +
                ", owner name: " + getOwnerName() +
                ", engine type: " + getEngineType() +
                ", year: " + getYear() +
                ", insurance number: " + getInsuranceNumber() +
                ", battery capacity: " + getBatteryCapacity() + "kW/h" +
                "}";
    }
}