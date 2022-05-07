package model;

public class Hybrid extends Car {

    private dpuble tankCapacity;
    private double gasConsumption;
    private double batteryDuration;
    private double batteryConsumption;

    public Hybrid(double basePrice, double salePrice, String brand, String modell, double displacement, double mileage,boolean type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows, double tankCapacity, double gasConsumption, double batteryDuration, double batteryConsumption){

        super(basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard);
        this.tankCapacity = tankCapacity;
        this.gasConsumption = gasConsumption;
        this.batteryDuration = batteryDuration;
        this.batteryConsumption = batteryConsumption;
    }
    

    /**
     * @return dpuble return the tankCapacity
     */
    public dpuble getTankCapacity() {
        return tankCapacity;
    }

    /**
     * @param tankCapacity the tankCapacity to set
     */
    public void setTankCapacity(dpuble tankCapacity) {
        this.tankCapacity = tankCapacity;
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

    /**
     * @return double return the batteryDuration
     */
    public double getBatteryDuration() {
        return batteryDuration;
    }

    /**
     * @param batteryDuration the batteryDuration to set
     */
    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    /**
     * @return double return the batteryConsumption
     */
    public double getBatteryConsumption() {
        return batteryConsumption;
    }

    /**
     * @param batteryConsumption the batteryConsumption to set
     */
    public void setBatteryConsumption(double batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
    }

}
