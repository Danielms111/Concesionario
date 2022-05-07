package model;

public class Electric extends Car {

    private double batteryDuration;
    private double batteryConsumption;

    public Electric(double basePrice, double salePrice, String brand, String modell, double displacement, double mileage,boolean type, String plaque, boolean propertyCardd, String propertyCard, double batteryDuration, double batteryConsumption){

        super(basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard);
        this.batteryDuration = batteryDuration;
        this.batteryConsumption = batteryConsumption;


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
     * @return double return the batteryConsumptions
     */
    public double getBatteryConsumption() {
        return batteryConsumption;
    }

    /**
     * @param batteryConsumptions the batteryConsumptions to set
     */
    public void setBatteryConsumption(double batteryConsumption) {
        this.batteryConsumption = batteryConsumption;
    }

}
