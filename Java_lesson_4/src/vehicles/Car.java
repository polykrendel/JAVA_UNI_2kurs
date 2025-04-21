package vehicles;

public class Car extends Vehicle{

    public Car(String model,String license,String color,String ownerName,String engineType,int year,int insuranceNumber){
        setInsuranceNumber(insuranceNumber);
        setOwnerName(ownerName);
        setColor(color);
        setLicense(license);
        setYear(year);
        setModel(model);
        setEngineType(engineType);
    }

    public Car() {
    }

    public String vehicleType(){
        return "Car";
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
                "}";
    }
}