package MainClasses;

import BrandsAndModels.Brand;

public class Taxi {

    private Brand brand;
    private String model;
    private int yearOfManufacture;
    private int numberOfSeats;
    private double loadCapacity;    // in kilograms
    private double fuelConsumption; // for 100km

    public Taxi (Brand brand, String model, int yearOfManufacture, int numberOfSeats, double loadCapacity, double fuelConsumption) {
        setBrand(brand);
        setModel(model);
        setYearOfManufacture(yearOfManufacture);
        setNumberOfSeats(numberOfSeats);
        setLoadCapacity(loadCapacity);
        setFuelConsumption(fuelConsumption);
    }

    // second constructor, make it yourself ;)
    public Taxi () {

    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
