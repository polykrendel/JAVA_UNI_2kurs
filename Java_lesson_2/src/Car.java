public class Car {
    private String model, license, color;
    private int year;

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car() {

    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel(){
        return model;
    }

    public String getLicense(){
        return license;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

    public int age(){
        final int curYear = 2024;
        int age = curYear - year;
        System.out.print("Возраст автомобиля = ");
        return age;
    }
}