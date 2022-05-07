package model;

public abstract class Vehiculo {

    public static final int MAX_DOCUMENT = 2;

    protected double basePrice;
    protected double salePrice;
    protected String brand;
    protected String modell;
    protected double displacement;
    protected double mileage;
    protected boolean type;
    protected String plaque;
    protected boolean propertyCardd;
    protected String propertyCard;

    private Document [] documents =  new Document [MAX_DOCUMENT];

    public Vehiculo(double basePrice, double salePrice, String brand, String modell, double displacement, double mileage,boolean type, String plaque, boolean propertyCardd, String propertyCard){

        this.basePrice = basePrice;
        this.salePrice = salePrice;
        this.brand = brand;
        this.modell = modell;
        this.displacement = displacement;
        this.mileage = mileage;
        this.type = type;
        this.plaque = plaque;
        this.propertyCardd = propertyCardd;
        this.propertyCard = propertyCard;
    }
    

    /**
     * @return double return the basePrice
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return double return the salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return String return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return double return the displacement
     */
    public double getDisplacement() {
        return displacement;
    }

    /**
     * @param displacement the displacement to set
     */
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    /**
     * @return double return the mileage
     */
    public double getMileage() {
        return mileage;
    }

    /**
     * @param mileage the mileage to set
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    /**
     * @return String return the plaque
     */
    public String getPlaque() {
        return plaque;
    }

    /**
     * @param plaque the plaque to set
     */
    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    /**
     * @return boolean return the propertyCardd
     */
    public boolean isPropertyCardd() {
        return propertyCardd;
    }

    /**
     * @param propertyCardd the propertyCardd to set
     */
    public void setPropertyCardd(boolean propertyCardd) {
        this.propertyCardd = propertyCardd;
    }

    /**
     * @return String return the propertyCard
     */
    public String getPropertyCard() {
        return propertyCard;
    }

    /**
     * @param propertyCard the propertyCard to set
     */
    public void setPropertyCard(String propertyCard) {
        this.propertyCard = propertyCard;
    }


    /**
     * @return boolean return the type
     */
    public boolean isType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(boolean type) {
        this.type = type;
    }


    /**
     * @return Document return the documents
     */
    public Document getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    public void setDocuments(Document documents) {
        this.documents = documents;
    }

    /**
     * @return String return the modell
     */
    public String getModell() {
        return modell;
    }

    /**
     * @param documents the documents to set
     */
    public void setModel(String model) {
        this.model = model;
    }



}
