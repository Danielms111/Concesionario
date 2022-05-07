package model;

public class Motorcycle extends Vehiculo{

    private double gasCapacity;
    private double gasConsumption;

    public Motorcycle(double basePrice, double salePrice, String brand, String modell, double displacement, double mileage,boolean type, String plaque, boolean propertyCardd, String propertyCard, double gasCapacity, double gasConsumption){

        super(basePrice, salePrice, brand, modell, displacement, mileage, type, propertyCardd, propertyCard);
        this.gasCapacity = gasCapacity;
        this.gasConsumption = gasConsumption;

    }
    

    /**
     * @return double return the gasCapacity
     */
    public double getGasCapacity() {
        return gasCapacity;
    }

    /**
     * @param gasCapacity the gasCapacity to set
     */
    public void setGasCapacity(double gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    /**
     * @return double return the gasConsumption
     */
    public double getGasConsumption() {
        return gasConsumption;
    }

    /**
     * @param gasConsumption the gasConsumption to set
     */
    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

}
