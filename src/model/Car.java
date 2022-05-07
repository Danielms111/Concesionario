package model;

public class Car extends Vehiculo {

    protected int numberOfDoors;
    protected boolean polarizedWindows;

    public Car(double basePrice, double salePrice, String brand, String modell, double displacement, double mileage,boolean type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows){

        super(basePrice, salePrice, brand, modell, displacement, mileage, type, propertyCardd, propertyCard);
        this.numberOfDoors = numberOfDoors;
        this.polarizedWindows = polarizedWindows;

    }

    

    /**
     * @return int return the numberOfDoors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * @param numberOfDoors the numberOfDoors to set
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * @return boolean return the polarizedWindows
     */
    public boolean isPolarizedWindows() {
        return polarizedWindows;
    }

    /**
     * @param polarizedWindows the polarizedWindows to set
     */
    public void setPolarizedWindows(boolean polarizedWindows) {
        this.polarizedWindows = polarizedWindows;
    }

}
