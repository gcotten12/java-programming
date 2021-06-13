package day53_inheritance.tesla;

public class ElectricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;

    protected void drive(int miles) {
        if(range == 0 || range - miles < 0) {
            System.out.println("Error cannot drive that far, need to charge");
        }else {
            range -= miles;
            System.out.println("Driving " +  miles + " miles ...");
        }
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
