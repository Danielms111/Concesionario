package model;

import java.util.ArrayList;
import java.util.zip.ZipEntry;

public class ParkingLot {

    public static final int MAX_COLUMNAS = 5;
    public static final int MAX_FILAS = 10;

    public static final int filas = 4;
    public static final int columnas = 4;

    private ArrayList<Vehiculo> vehiculos;

    private Vehiculo [][] parking;

    private int [][] documentoSOAT = new int [filas][columnas];
    private int [][] documentoReview = new int [filas][columnas];
    private int [][] propertyCard = new int [filas][columnas];

    Motorcycle motorcycle;
    Gas gasCar;
    Electric electricCar;
    Hybrid hybridCar;


    public ParkingLot() {

        parking = new Vehiculo[MAX_FILAS][MAX_COLUMNAS];
        vehiculos = new ArrayList<Vehiculo>();
        documentoSOAT = new int [filas][columnas];
        documentoReview = new int [filas][columnas];
    }

    private String printNumeric(int[][] documentoSOAT) {
		String print ="";
		for (int i=0; i< documentoSOAT.length; i++ ) { // filas numbers.length
			for (int j = 0; j < documentoSOAT[0].length; j++) { //columnas numbers[0].length
				print += documentoSOAT[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}

    public String generateSOAT(){

        String out ="";
        String outt = "";

			for(int i=0;i<filas;i++){

				for (int j=0;j<columnas;j++){

		            documentoSOAT[i][j] = (int)(Math.random()*(100-1+1)+1);

		    }
		  }

            for(int i=0;i<filas;i++){
                for(int j=0;j<columnas;j++){

                  if(i==0 && j==0){
                      out += documentoSOAT[i][j];
                  }
                  if(i==1 && j==0){
                      out += documentoSOAT[i][j];
                  }
                  if(i==2 && j==0){
                      out += documentoSOAT[i][j];
                  }
                  if(i==3 && j==0){
                      out += documentoSOAT[i][j];
                  }
                  if(i==3 && j==1){
                      out += documentoSOAT[i][j];
                  }
                  if(i==3 && j==2){
                      out += documentoSOAT[i][j];
                  }
                  if(i==3 && j==3){
                      out += documentoSOAT[i][j];
                  }

                }
            }

            outt = printNumeric(documentoSOAT);

        return outt + "\n" + "The code for the SOAT is: " + out;

    }

    public String generateReview(){

        String out ="";
        String outt = "";

        for(int i=0;i<filas;i++){

            for (int j=0;j<columnas;j++){

                documentoReview[i][j] = (int)(Math.random()*(100-1+1)+1);

            }
        }

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){

              if(i==0 && j==0){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==1){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==2){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==3){
                  out += documentoReview[i][j];
              }
              if(i==1 && j==2){
                  out += documentoReview[i][j];
              }
              if(i==2 && j==1){
                  out += documentoReview[i][j];
              }
              if(i==3 && j==0){
                  out += documentoReview[i][j];
              }
              if(i==3 && j==1){
                out += documentoReview[i][j];
              }
              if(i==3 && j==2){
                out += documentoReview[i][j];
              }
              if(i==3 && j==3){
                out += documentoReview[i][j];
              }

            }
        }

        outt = printNumeric(documentoReview);

        return outt + "\n" + "The code for the Technical Mechanical Review is: " + out;
    }

    public String generatePropertyCard(){

        String out ="";
        String outt = "";

			for(int i=0;i<filas;i++){

				for (int j=0;j<columnas;j++){

		            propertyCard[i][j] = (int)(Math.random()*(100-1+1)+1);

		    }
		  }

            for(int i=3;i>0;i--){
                for(int j=3;j>0;j--){

                  if(i==3 && j==3){
                      out += propertyCard[i][j];
                  }
                  if(i==3 && j==1){
                      out += propertyCard[i][j];
                  }
                  if(i==2 && j==2){
                      out += propertyCard[i][j];
                  }
                  if(i==2 && j==0){
                      out += propertyCard[i][j];
                  }
                  if(i==1 && j==3){
                      out += propertyCard[i][j];
                  }
                  if(i==1 && j==1){
                      out += propertyCard[i][j];
                  }
                  if(i==0 && j==2){
                      out += propertyCard[i][j];
                  }

                }
            }

            outt = printNumeric(propertyCard);


        return outt + "\n" + "The code for the Property Card is: " + out + "\n";

    }

    public String travelMatrixSOAT(){

        String out = "";

        generateSOAT();

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){

              if(i==0 && j==0){
                  out += documentoSOAT[i][j];
              }
              if(i==1 && j==0){
                  out += documentoSOAT[i][j];
              }
              if(i==2 && j==0){
                  out += documentoSOAT[i][j];
              }
              if(i==3 && j==0){
                  out += documentoSOAT[i][j];
              }
              if(i==3 && j==1){
                  out += documentoSOAT[i][j];
              }
              if(i==3 && j==2){
                  out += documentoSOAT[i][j];
              }
              if(i==3 && j==3){
                  out += documentoSOAT[i][j];
              }

            }
        }


       return out;
    }

   public String travelMatrixReview(){

      String out ="";

      generateReview();

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){

              if(i==0 && j==0){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==1 && out.length()==1){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==2 && out.length()==2){
                  out += documentoReview[i][j];
              }
              if(i==0 && j==3 && out.length()==3){
                  out += documentoReview[i][j];
              }
              if(i==1 && j==2 && out.length()==4){
                  out += documentoReview[i][j];
              }
              if(i==2 && j==1 && out.length()==5){
                  out += documentoReview[i][j];
              }
              if(i==3 && j==0 && out.length()==6){
                  out += documentoReview[i][j];
              }
              if(i==3 && j==1 && out.length()==7){
                out += documentoReview[i][j];
              }
              if(i==3 && j==2 && out.length()==8){
                out += documentoReview[i][j];
              }
              if(i==3 && j==3 && out.length()==9){
                out += documentoReview[i][j];
              }

            }
        }

        return out;
    }

    public String travelMatrixCard(){

        String out = "";

        generatePropertyCard();

        for(int i=3;i>0;i--){
            for(int j=3;j>0;j--){

              if(i==3 && j==3){
                  out += propertyCard[i][j];
              }
              if(i==3 && j==1){
                  out += propertyCard[i][j];
              }
              if(i==2 && j==2){
                  out += propertyCard[i][j];
              }
              if(i==2 && j==0){
                  out += propertyCard[i][j];
              }
              if(i==1 && j==3){
                  out += propertyCard[i][j];
              }
              if(i==1 && j==1){
                  out += propertyCard[i][j];
              }
              if(i==0 && j==2){
                  out += propertyCard[i][j];
              }

            }
        }

        return out;
    }

    public String motorcycleRegister(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean propertyCardd, String propertyCard, double gasCapacity, double gasConsumption, int z, double price, int year, double amountOfCoverage, double price2, int year2, double gasLevels) {

        String out ="";

        //String image1 = travelMatrixSoat();

        Soat soat = new Soat(price, year, travelMatrixSOAT(), amountOfCoverage);
        TechnicalMechanicalReview review = new TechnicalMechanicalReview(price2, year2, travelMatrixReview(), gasLevels);

        MotorcycleType motorcycleType = null;

        switch(z){

            case 1:
                motorcycleType = MotorcycleType.STANDAR;
                break;
            case 2:
                motorcycleType = MotorcycleType.SPORTIVE;
                break;
            case 3:
                motorcycleType = MotorcycleType.SCOOTER;
                break;  
            case 4:
                motorcycleType = MotorcycleType.CROSS;
        }

        /*if(propertyCardd == false){

            propertyCard = "NOT SOLD";
        }else{

            propertyCard = travelMatrixCard();
        }*/

        Motorcycle motorcycle = new Motorcycle(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard, gasCapacity, gasConsumption, motorcycleType, review, soat);
        vehiculos.add(motorcycle);

        for(int i=0;i<MAX_FILAS;i++){
            for(int j=0;j<MAX_COLUMNAS;j++){

                if(modell<2015&&type.equalsIgnoreCase("USED")){

                    if(modell==2014&&j==1){

                        parking[i][j] = motorcycle;

                    }if(modell==2013&&j==2){

                        parking[i][j] = motorcycle;

                    }if(modell==2012&&j==3){

                        parking[i][j] = motorcycle;

                    }if(modell==2011&&j==4){

                        parking[i][j] = motorcycle;

                    }if(modell<2011&&j==5){

                        parking[i][j] = motorcycle;
                    }

                }

            }
        }

        out += "Vehicle succesfully registrated";

        return out;
    }

    public String gasCarRegister(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows, double tankCapacity, double gasConsumption, int z, int p,double price, int year, double amountOfCoverage, double price2, int year2, double gasLevels) {

        String out ="";

        Soat soat = new Soat(price, year, travelMatrixSOAT(), amountOfCoverage);
        TechnicalMechanicalReview review = new TechnicalMechanicalReview(price2, year2, travelMatrixReview(), gasLevels);

        CarType carType = null;
        GasType gasType = null;

        switch(z){

            case 1:
                carType = CarType.SEDAN;
                break;
            case 2:
                carType = CarType.CAMIONETA;
                break;
        }

        switch(p){

            case 1:
                gasType = GasType.EXTRA;
                break;
            case 2:
                gasType = GasType.CORRIENTE;
                break;
            case 3:
                gasType = GasType.DIESEL;    
        }

        Gas gasCar = new Gas(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard, numberOfDoors, polarizedWindows, carType, tankCapacity, gasConsumption, gasType, review, soat);
        vehiculos.add(gasCar);

        for(int i=0;i<MAX_FILAS;i++){
            for(int j=0;j<MAX_COLUMNAS;j++){

                if(modell<2015&&type.equalsIgnoreCase("USED")){

                    if(modell==2014&&j==1){

                        parking[i][j] = gasCar;

                    }if(modell==2013&&j==2){

                        parking[i][j] = gasCar;

                    }if(modell==2012&&j==3){

                        parking[i][j] = gasCar;

                    }if(modell==2011&&j==4){

                        parking[i][j] = gasCar;

                    }if(modell<2011&&j==5){

                        parking[i][j] = gasCar;
                    }

                }

            }
        }

        out += "Vehicle succesfully registrated";

        return out;
    }

    public String electricCarRegister(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows, double batteryDuration, double batteryConsumption, int z, int p, double price, int year, double amountOfCoverage, double price2, int year2, double gasLevels) {

        String out ="";

        Soat soat = new Soat(price, year, travelMatrixSOAT(), amountOfCoverage);
        TechnicalMechanicalReview review = new TechnicalMechanicalReview(price2, year2, travelMatrixReview(), gasLevels);

        CarType carType = null;
        Charger charger = null;

        switch(z){

            case 1:
                carType = CarType.SEDAN;
                break;
            case 2:
                carType = CarType.CAMIONETA;
                break;
        }

        switch(p){

            case 1:
                charger = Charger.FAST;
                break;
            case 2:
                charger = Charger.NORMAL;
                break;
        }

        Electric electricCar = new Electric(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard, numberOfDoors, polarizedWindows, carType, batteryDuration, batteryConsumption, charger, review, soat);
        vehiculos.add(electricCar);

        for(int i=0;i<MAX_FILAS;i++){
            for(int j=0;j<MAX_COLUMNAS;j++){

                if(modell<2015&&type.equalsIgnoreCase("USED")){

                    if(modell==2014&&j==1){

                        parking[i][j] = electricCar;

                    }if(modell==2013&&j==2){

                        parking[i][j] = electricCar;

                    }if(modell==2012&&j==3){

                        parking[i][j] = electricCar;

                    }if(modell==2011&&j==4){

                        parking[i][j] = electricCar;

                    }if(modell<2011&&j==5){

                        parking[i][j] = electricCar;
                    }

                }

            }
        }

        out += "Vehicle succesfully registrated";

        return out;
    }

    public String hybridCarRegister(String id, double basePrice, double salePrice, String brand, int modell, double displacement, double mileage,String type, String plaque, boolean propertyCardd, String propertyCard, int numberOfDoors, boolean polarizedWindows, double tankCapacity, double gasConsumption, double batteryDuration, double batteryConsumption, int z, int p, int n, double price, int year, double amountOfCoverage, double price2, int year2, double gasLevels) {

        String out ="";

        Soat soat = new Soat(price, year, travelMatrixSOAT(), amountOfCoverage);
        TechnicalMechanicalReview review = new TechnicalMechanicalReview(price2, year2, travelMatrixReview(), gasLevels);

        CarType carType = null;
        GasType gasType = null;
        Charger charger = null;

        switch(z){

            case 1:
                carType = CarType.SEDAN;
                break;
            case 2:
                carType = CarType.CAMIONETA;
                break;
        }

        switch(p){

            case 1:
                gasType = GasType.EXTRA;
                break;
            case 2:
                gasType = GasType.CORRIENTE;
                break;
            case 3:
                gasType = GasType.DIESEL;    
        }

        switch(n){

            case 1:
                charger = Charger.FAST;
                break;
            case 2:
                charger = Charger.NORMAL;
                break;
        }

        Hybrid hybridCar = new Hybrid(id, basePrice, salePrice, brand, modell, displacement, mileage, type, plaque, propertyCardd, propertyCard, numberOfDoors, polarizedWindows, carType, tankCapacity, gasConsumption, batteryDuration, batteryConsumption, gasType, charger, review, soat);
        vehiculos.add(hybridCar);

        for(int i=0;i<MAX_FILAS;i++){
            for(int j=0;j<MAX_COLUMNAS;j++){

                if(modell<2015&&type.equalsIgnoreCase("USED")){

                    if(modell==2014&&j==1){

                        parking[i][j] = hybridCar;

                    }if(modell==2013&&j==2){

                        parking[i][j] = hybridCar;

                    }if(modell==2012&&j==3){

                        parking[i][j] = hybridCar;

                    }if(modell==2011&&j==4){

                        parking[i][j] = hybridCar;

                    }if(modell<2011&&j==5){

                        parking[i][j] = hybridCar;
                    }

                }

            }
        }

        out += "Vehicle succesfully registrated";

        return out;
    }

    public String showVehicles(){

        String out = "";
        int b =0;

        System.out.println("Choose the vehicle you want to calculate Total Sale Price");

        for(Vehiculo cadena: vehiculos){

            System.out.println("(" + b++ + ") " + cadena.toString());
        }

        return out;
    }

    public String calculateTotalSalePrice(int i){

        String out = "";

        out += vehiculos.get(i).getSalePrice();

        return out;
    }

    public String showReport(){

        String out = "";
        int b=0;

        for(Vehiculo cadena: vehiculos){

            System.out.println("(" + b++ + ") " + cadena.informe() + "\n" );
        }

        return out;

    }

    public String vehicleId(String id){

        String out = "There is no vehicle with that ID";

        for(Vehiculo cadena: vehiculos){

            if(cadena.getId().equalsIgnoreCase(id)){

                out = "\nThe code for the property card is: " + cadena.getPropertyCard() + "\n";

                if(cadena.getSoatYear()>=2022){

                    out += "\nVALID SOAT: " + "\n" + 
                           cadena.getSoat() + "\n"; 
                }else{

                    out += "\nEXPIRED SOAT: " + "\n" + 
                         cadena.getSoat() + "\n";

                }

                if(cadena.getTechnicalReviewYear()>=2022){

                    out += "VALID TECHNICAL MECHANICAL REVIEW: " + "\n" + 
                            cadena.getTechnicalReview() + "\n";

                }else{

                    out += "EXIRED TECHNICAL MECHANICAL REVIEW: " + "\n" + 
                            cadena.getTechnicalReview() + "\n";

                }
            
            }

        }

        return out;
    }
    
}
