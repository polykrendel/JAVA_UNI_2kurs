package vehicles;

public class Car {
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    public Car() {
    }

    public String getOwnerName(){
        return ownerName;
    }

    public int getInsuranceNumber(){
        return insuranceNumber;
    }

    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }

    public void setInsuranceNumber(int insuranceNumber){
        this.insuranceNumber=insuranceNumber;
    }

    public String getEngineType(){
        return engineType;
    }

    public void setEngineType(String engineType){
        this.engineType=engineType;
    }
}
