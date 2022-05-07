package model;

public class Gas extends Car {

    private dpuble tankCapacity;
    private double gasConsumption;

    public Gas(double basePrice, double salePrice, String brand, String modell, double displacement, double mileage,boolean type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows, double tankCapacity, double gasConsumption){

        super(basePrice, salePrice, brand, modell, displacement, mileage, type, propertyCardd, propertyCard, numberOfDoors, polarizedWindows);
        this.tankCapacity = tankCapacity;
        this.gasConsumption = gasConsumption;


    }
    
}
