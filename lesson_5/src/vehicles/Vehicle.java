package vehicles;

public abstract class Vehicle {
    protected String model;
    protected String license;
    protected String color;
    protected int year;
    protected String ownerName;
    protected String insuranceNumber;
    protected String engineType;
    public Vehicle(String model, String license, String color, int year,
                   String ownerName, String insuranceNumber) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = "Unknown";
    }
    public String getModel() {
        return model;
    }
    public String getLicense() {
        return license;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    @Override
    public String toString() {
        return model + " " + license + " " + color + " " + year + " " +
                ownerName + " " + insuranceNumber + " " + engineType;
    }
    public abstract String vehicleType();
}
