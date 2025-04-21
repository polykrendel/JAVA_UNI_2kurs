package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private String ownerName;
    protected String engineType;
    private int year;
    private int insuranceNumber;

    public abstract String vehicleType();

    public void setColor(String color) {
        this.color = color;
    }

    public void setInsuranceNumber(int insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getLicense() {
        return license;
    }

    public String getModel() {
        return model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getEngineType() {
        return engineType;
    }
}