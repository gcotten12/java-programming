package day46_encapsulation;

public class Car {
    private String model;
    private int year;
    private int mileage;

    public void carInfo(String setModel, int setYear, int setMileage) {
        model = setModel;
        year = setYear;
        mileage = setMileage;
    }

    public String getModel() { return model; }

    public int getYear() { return year; }

    public int getMileage() { return mileage; }

    @Override
    public String toString() {
        return "Car: " +
                "model = " + model +
                ", year = " + year +
                ", mileage = " + mileage
                ;
    }
}
