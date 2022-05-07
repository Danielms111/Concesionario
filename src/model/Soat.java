package model;

public class Soat extends Document {

    private double amountOfCoverage;

    public Soat(double price, int year, String image, double amountOfCoverage) {

        super(price, year, image);
        this.amountOfCoverage = amountOfCoverage;
    }
    

    /**
     * @return double return the amountOfCoverage
     */
    public double getAmountOfCoverage() {
        return amountOfCoverage;
    }

    /**
     * @param amountOfCoverage the amountOfCoverage to set
     */
    public void setAmountOfCoverage(double amountOfCoverage) {
        this.amountOfCoverage = amountOfCoverage;
    }

}
