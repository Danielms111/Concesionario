package ui;

import java.util.Scanner;

import model.ParkingLot;

/**
 * 
 * @author Daniel Montezuma
 */
public class MainConsecionario {
	
	private Scanner sc;
	private ParkingLot parking;
	
	public MainConsecionario(){
		sc= new Scanner(System.in);
		parking = new ParkingLot();
	}

	public static void main(String[] args) {
		
		System.out.println("\nWelcome to the concessionaire");
		MainConsecionario ppal= new MainConsecionario();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Main menu, please pick an option\n" +
				"(1) Register vehicle \n" +
				"(2) Calculate total selling price \n"+
				"(3) Generate reports with all vehicle data\n"+
				"(4) Show document status\n" + 
                "(5) Generate parking map\n" + 
                "(6) Generate parking lot occupancy reports\n" +  
				"(0) To leave the application"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}

    public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			registerVehicle();
			break;
		case 2:
			salePrice();
			break;
		case 3:
			generateReport();
			break;
        case 4:
            searchId();
            break;
        case 5:
            printParkingMap();
            break;
        case 6:
            parkingReports();
            break;      
		
		default:
			System.out.println("Error, wrong option");
		
		}

	}

    public String registerVehicle() {

        String out="";
        int option=0;

        String id;
        double basePrice;
        double salePrice;
        String brand;
        int modell;
        double displacement=0;
        double milleage=0;
        int typee;
        String type = "";
        String plaque;
        int q;
        boolean propertyCardd = false;
        String propertyCard;
        double gasCapacity;
        double gasConsumption;
        int i;

        int j;
        int numberOfDoors;
        int polarized;
        boolean polarizedWindows = false;
        double tankCapacity;

        double batteryDuration;
        double batteryConsumption;

        int n;

        double price = 0;
        int year = 0;
        //String image;
        double amountOfCoverage;

        double price2 = 0;
        int year2 = 0;
        //String image;
        double gasLevels;

        System.out.println(
				"\n Please pick an option\n" +
				"(1) Register motorcycle \n" +
				"(2) Register gas car \n"+
				"(3) register electric car\n"+
				"(4) register hybrid car\n"  
				);

        option=sc.nextInt();
        sc.nextLine();

        switch(option){

            case 1:

                System.out.println("Enter the id of the vehicle:");
                id = sc.nextLine();

                System.out.println("Enter the base price of the motocycle:");
                basePrice = sc.nextDouble();
                sc.nextLine();

                //System.out.println("Enter the sale price of the motorcycle:");
                //salePrice = sc.nextDouble();
                //sc.nextLine();

                System.out.println("Enter the brand of the motorcycle:");
                brand = sc.nextLine();

                System.out.println("Enter the model of the motorcyle:");
                modell = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the displacement of the motorcyle:");
                displacement = sc.nextDouble();

                System.out.println("Enter the milleage of the motorcycle:");
                milleage = sc.nextDouble();

                System.out.println("Pick an option:\n" +
                                       "(1) USED\n" +
                                       "(2) NEW\n");
                typee = sc.nextInt();
                sc.nextLine();

                switch(typee){

                    case 1:
                        type = "USED";
                        break;
                    case 2:
                        type = "NEW";
                        break;  
                        
                    default:
                      System.out.println("Invalid option");    
                }

                if(type.equalsIgnoreCase("NEW")){

                    plaque = "NOT ASSIGNED";

                }else{

                    System.out.println("Enter the plaque of the motorcycle:");
                    plaque = sc.nextLine();
                }

                System.out.println("Does the motrocyle haa been sold:\n" + 
                                       "(1) YES\n" +
                                       "(2) NO\n");

                q = sc.nextInt();
                sc.nextLine();
                
                switch(q){

                    case 1:
                        propertyCardd = true;
                        break;
                    case 2:
                        propertyCardd = false;
                        break;    
                }

                if(propertyCardd){

                    propertyCard = parking.travelMatrixCard();
                    System.out.println(parking.generatePropertyCard());


                }else{
                    propertyCard = "NOT SOLD";
                }

                System.out.println("Enter the gas capacity of the motorcycle:");
                gasCapacity = sc.nextDouble();

                gasConsumption = gasCapacity*(displacement*75);
                System.out.println("The gas consumption of the motorcycle is: " + gasConsumption);
                System.out.println("");

                System.out.println("Enter the type of the motorcycle:\n"+"(1) STANDAR\n"+
                "(2) SPORTIVE\n"+
                "(3) SCOOTER\n"+
                "(4) CROSS\n");
                i=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the price of the SOAT document: ");
                price = sc.nextDouble();

                System.out.println("Enter the year of the SOAT document:");
                year = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the amount of coverage of the SOAT document:");
                amountOfCoverage = sc.nextDouble();

                System.out.println("Enter the price of the Tecnichal Mechanical Review document: ");
                price2 = sc.nextDouble();

                System.out.println("Enter the year of the Tecnichal Mechanical Review document:");
                year2 = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the gas levels of the vehicle for the Tecnichal Mechanical Review document:");
                gasLevels = sc.nextDouble();
                System.out.println("");

                System.out.println(parking.generateSOAT());
                System.out.println("");
                System.out.println(parking.generateReview());
                System.out.println("");

                if(year<2022 || year2<2022){

                    salePrice = 500000;
                }else{
                    salePrice = 0;
                }

                salePrice = salePrice + (basePrice*0.04);

                if(type.equalsIgnoreCase("USED")){

                    salePrice = salePrice - (basePrice*0.02);
                }



                parking.motorcycleRegister(id, basePrice, salePrice, brand, modell, displacement, milleage, type, plaque, propertyCardd, propertyCard, gasCapacity, gasConsumption, i, price, year, amountOfCoverage, price2, year2, gasLevels);

                System.out.println("Motorcycle succesfully registrated");
                System.out.println("");

                break;
            case 2:

                System.out.println("Enter the id of the vehicle:");
                id = sc.nextLine();

                System.out.println("Enter the base price of the Gas Car:");
                basePrice = sc.nextDouble();
                sc.nextLine();


                /*System.out.println("Enter the sale price of the Gas Car:");
                salePrice = sc.nextDouble();
                sc.nextLine();*/

                System.out.println("Enter the brand of the Gas Car:");
                brand = sc.nextLine();

                System.out.println("Enter the model of the Gas Car:");
                modell = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the displacement of the Gas Car:");
                displacement = sc.nextDouble();

                System.out.println("Enter the milleage of the Gas Car:");
                milleage = sc.nextDouble();

                System.out.println("Pick an option:\n" +
                                       "(1) USED\n" +
                                       "(2) NEW\n");
                typee = sc.nextInt();
                sc.nextLine();

                switch(typee){

                    case 1:
                        type = "USED";
                        break;
                    case 2:
                        type = "NEW";
                        break;  
                        
                    default:
                      System.out.println("Invalid option");    
                }

                if(type.equalsIgnoreCase("NEW")){

                    plaque = "NOT ASSIGNED";

                }else{

                    System.out.println("Enter the plaque of the Gas Car:");
                    plaque = sc.nextLine();
                }

                System.out.println("Does the car has been sold:\n" + 
                                       "(1) YES\n" +
                                       "(2) NO\n");

                q = sc.nextInt();
                sc.nextLine();
                
                switch(q){

                    case 1:
                        propertyCardd = true;
                        break;
                    case 2:
                        propertyCardd = false;
                        break;    
                }

                if(propertyCardd){

                    propertyCard = parking.travelMatrixCard();
                    System.out.println(parking.generatePropertyCard());

                }else{
                    propertyCard = "NOT SOLD";
                }

                System.out.println("Enter the number of doors of the Gas Car:");
                numberOfDoors = sc.nextInt();
                sc.nextLine();

                System.out.println("Does the car has polarized windows:\n" +
                                      "(1) YES\n" + 
                                      "(2) NO\n");
                polarized = sc.nextInt();
                sc.nextLine();

                switch(polarized){

                    case 1:
                        polarizedWindows = true;
                        break;
                    case 2:
                        polarizedWindows = false;
                        break;
                        
                    default:
                        System.out.println("Wrong option");    
                }


                System.out.println("Enter the tank capacity of the gas Car:");
                tankCapacity = sc.nextDouble();

                gasConsumption = tankCapacity*(displacement*150);
                System.out.println("The gas consumption of the Gas Car is: " + gasConsumption);
                System.out.println("");

                System.out.println("Enter the type of the Gas Car:\n"+"(1) SEDAN\n"+
                "(2) CAMIONETA\n");
                i=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the type of gas of the Gas Car:\n"+"(1) EXTRA\n"+
                                   "(2) CORRIENTE\n"+ 
                                   "(3) DIESEL");
                j=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the price of the SOAT document: ");
                price = sc.nextDouble();

                System.out.println("Enter the year of the SOAT document:");
                year = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the amount of coverage of the SOAT document:");
                amountOfCoverage = sc.nextDouble();

                System.out.println("Enter the price of the Tecnichal Mechanical Review document: ");
                price2 = sc.nextDouble();

                System.out.println("Enter the year of the Tecnichal Mechanical Review document:");
                year2 = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the gas levels of the vehicle for the Tecnichal Mechanical Review document:");
                gasLevels = sc.nextDouble();
                System.out.println("");

                System.out.println(parking.generateSOAT());
                System.out.println("");
                System.out.println(parking.generateReview());
                System.out.println("");

                if(year<2022 || year2<2022){

                    salePrice = 500000;
                }else{
                    salePrice = 0;
                }

                if(type.equalsIgnoreCase("USED")){

                    salePrice = salePrice - (basePrice*0.1);
                }

                parking.gasCarRegister(id, basePrice, salePrice, brand, modell, displacement, milleage, type, plaque, propertyCardd, propertyCard, numberOfDoors, polarizedWindows, tankCapacity, gasConsumption, i, j, price, year, amountOfCoverage, price2, year2, gasLevels);

                System.out.println("Gas Car succesfully registrated:");
                System.out.println("");

                break;
            case 3:
                System.out.println("");
                System.out.println("Enter the id of the vehicle:");
                id = sc.nextLine();

                System.out.println("Enter the base price of the Hybrid Car:");
                basePrice = sc.nextDouble();
                sc.nextLine();

                /*System.out.println("Enter the sale price of the Hybrid Car:");
                salePrice = sc.nextDouble();
                sc.nextLine();*/

                System.out.println("Enter the brand of the Hybrid Car:");
                brand = sc.nextLine();

                System.out.println("Enter the model of the Hybrid Car:");
                modell = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the displacement of the Hybrid Car:");
                displacement = sc.nextDouble();

                System.out.println("Enter the milleage of the Hybrid Car:");
                milleage = sc.nextDouble();

                System.out.println("Pick an option:\n" +
                                       "(1) USED\n" +
                                       "(2) NEW\n");
                typee = sc.nextInt();
                sc.nextLine();

                switch(typee){

                    case 1:
                        type = "USED";
                        break;
                    case 2:
                        type = "NEW";
                        break;  
                        
                    default:
                      System.out.println("Invalid option");    
                }

                if(type.equalsIgnoreCase("NEW")){

                    plaque = "NOT ASSIGNED";

                }else{

                    System.out.println("Enter the plaque of the Hybrid Car:");
                    plaque = sc.nextLine();
                }

                System.out.println("Does the car has been sold:\n" + 
                                       "(1) YES\n" +
                                       "(2) NO\n");

                q = sc.nextInt();
                sc.nextLine();
                
                switch(q){

                    case 1:
                        propertyCardd = true;
                        break;
                    case 2:
                        propertyCardd = false;
                        break;    
                }

                if(propertyCardd){

                    propertyCard = parking.travelMatrixCard();
                    System.out.println(parking.generatePropertyCard());

                }else{
                    propertyCard = "NOT SOLD";
                }

                System.out.println("Enter the number of doors of the Hybrid Car:");
                numberOfDoors = sc.nextInt();
                sc.nextLine();

                System.out.println("Does the car has polarized windows:\n" +
                                      "(1) YES\n" + 
                                      "(2) NO\n");
                polarized = sc.nextInt();
                sc.nextLine();

                switch(polarized){

                    case 1:
                        polarizedWindows = true;
                        break;
                    case 2:
                        polarizedWindows = false;
                        break;
                        
                    default:
                        System.out.println("Wrong option");    
                }

                System.out.println("Enter the type of charger:\n" + 
                                      "(1) FAST\n" + 
                                      "(2) NORMAL\n");
                j = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the battery duration of the Hybrid Car:");
                batteryDuration = sc.nextDouble();

                if(j==1){
                    batteryConsumption = (batteryDuration+13)*(displacement*100);
                }else{
                    batteryConsumption = (batteryDuration+18)*(displacement*100);
                }

                System.out.println("The bettery consumption of the Hybrid Car is: " + batteryConsumption);
                System.out.println("");

                System.out.println("Enter the type of the Hybrid Car:\n"+"(1) SEDAN\n"+
                "(2) CAMIONETA\n");
                i=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the price of the SOAT document: ");
                price = sc.nextDouble();

                System.out.println("Enter the year of the SOAT document:");
                year = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the amount of coverage of the SOAT document:");
                amountOfCoverage = sc.nextDouble();

                System.out.println("Enter the price of the Tecnichal Mechanical Review document: ");
                price2 = sc.nextDouble();

                System.out.println("Enter the year of the Tecnichal Mechanical Review document:");
                year2 = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the gas levels of the vehicle for the Tecnichal Mechanical Review document:");
                gasLevels = sc.nextDouble();
                System.out.println("");

                System.out.println(parking.generateSOAT());
                System.out.println("");
                System.out.println(parking.generateReview());
                System.out.println("");

                if(year<2022 || year2<2022){

                    salePrice = 500000;
                }else{
                    salePrice = 0;
                }

                salePrice = salePrice + (basePrice*0.2);

                if(type.equalsIgnoreCase("USED")){

                    salePrice = salePrice - (basePrice*0.1);
                }


                parking.electricCarRegister(id, basePrice, salePrice, brand, modell, displacement, milleage, type, plaque, propertyCardd, propertyCard, numberOfDoors, polarizedWindows, batteryDuration, batteryConsumption, i, j, price, year, amountOfCoverage, price2, year2, gasLevels);

                System.out.println("Hybrid Car succesfully registrated");
                System.out.println("");
                break;
            case 4:
                System.out.println("");
                //sc.nextLine();
                System.out.println("Enter the id of the vehicle:");
                //sc.nextLine();
                id = sc.nextLine();

                System.out.println("Enter the base price of the Hybrid Car:");
                basePrice = sc.nextDouble();
                sc.nextLine();

                /*System.out.println("Enter the sale price of the Hybrid Car:");
                salePrice = sc.nextDouble();
                sc.nextLine();*/

                System.out.println("Enter the brand of the Hybrid Car:");
                brand = sc.nextLine();

                System.out.println("Enter the model of the Hybrid Car:");
                modell = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the displacement of the Hybrid Car:");
                displacement = sc.nextDouble();

                System.out.println("Enter the milleage of the Hybrid Car:");
                milleage = sc.nextDouble();

                System.out.println("Pick an option:\n" +
                                       "(1) USED\n" +
                                       "(2) NEW\n");
                typee = sc.nextInt();
                sc.nextLine();

                switch(typee){

                    case 1:
                        type = "USED";
                        break;
                    case 2:
                        type = "NEW";
                        break;  
                        
                    default:
                      System.out.println("Invalid option");    
                }

                if(type.equalsIgnoreCase("NEW")){

                    plaque = "NOT ASSIGNED";

                }else{

                    System.out.println("Enter the plaque of the Hybrid Car:");
                    plaque = sc.nextLine();
                }

                System.out.println("Does the car has been sold:\n" + 
                                       "(1) YES\n" +
                                       "(2) NO\n");

                q = sc.nextInt();
                sc.nextLine();
                
                switch(q){

                    case 1:
                        propertyCardd = true;
                        break;
                    case 2:
                        propertyCardd = false;
                        break;    
                }

                if(propertyCardd){

                    propertyCard = parking.travelMatrixCard();
                    System.out.println(parking.generatePropertyCard());

                }else{
                    propertyCard = "NOT SOLD";
                }

                System.out.println("Enter the number of doors of the Hybrid Car:");
                numberOfDoors = sc.nextInt();
                sc.nextLine();

                System.out.println("Does the car has polarized windows:\n" +
                                      "(1) YES\n" + 
                                      "(2) NO\n");
                polarized = sc.nextInt();
                sc.nextLine();

                switch(polarized){

                    case 1:
                        polarizedWindows = true;
                        break;
                    case 2:
                        polarizedWindows = false;
                        break;
                        
                    default:
                        System.out.println("Wrong option");    
                }

                System.out.println("Enter the tank capacity of the Hybrid Car:");
                tankCapacity = sc.nextDouble();

                gasConsumption = tankCapacity*(displacement*150);
                System.out.println("The gas consumption of the Hybrid Car is: " + gasConsumption);
                System.out.println("");

                System.out.println("Enter the type of gas of the Hybrid Car:\n"+"(1) EXTRA\n"+
                                   "(2) CORRIENTE\n"+ 
                                   "(3) DIESEL");
                n=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the type of charger:\n" + 
                                      "(1) FAST\n" + 
                                      "(2) NORMAL\n");
                j = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the battery duration of the Hybrid Car:");
                batteryDuration = sc.nextDouble();

                if(j==1){
                    batteryConsumption = (batteryDuration+13)*(displacement*100);
                }else{
                    batteryConsumption = (batteryDuration+18)*(displacement*100);
                }

                System.out.println("The bettery consumption of the Hybrid Car is: " + batteryConsumption);
                System.out.println("");

                System.out.println("Enter the type of the Hybrid Car:\n"+"(1) SEDAN\n"+
                "(2) CAMIONETA\n");
                i=sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the price of the SOAT document: ");
                price = sc.nextDouble();

                System.out.println("Enter the year of the SOAT document:");
                year = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the amount of coverage of the SOAT document:");
                amountOfCoverage = sc.nextDouble();

                System.out.println("Enter the price of the Tecnichal Mechanical Review document: ");
                price2 = sc.nextDouble();

                System.out.println("Enter the year of the Tecnichal Mechanical Review document:");
                year2 = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the gas levels of the vehicle for the Tecnichal Mechanical Review document:");
                gasLevels = sc.nextDouble();
                System.out.println("");

                System.out.println(parking.generateSOAT());
                System.out.println("");
                System.out.println(parking.generateReview());
                System.out.println("");

                if(year<2022 || year2<2022){

                    salePrice = 500000;
                }else{
                    salePrice = 0;
                }

                salePrice = salePrice + (basePrice*0.15);

                if(type.equalsIgnoreCase("USED")){

                    salePrice = salePrice - (basePrice*0.1);
                }

                parking.hybridCarRegister(id, basePrice, salePrice, brand, modell, displacement, milleage, type, plaque, propertyCardd, propertyCard, numberOfDoors, polarizedWindows, tankCapacity, gasConsumption, batteryDuration, batteryConsumption, i, n, j, price, year, amountOfCoverage, price2, year2, gasLevels);

                System.out.println("Hybrid Car succesfully registrated");
                System.out.println("");
                break;
                
            default:
               System.out.println("Error, Wrong option"); 
        }

        return out;
    }

    public String salePrice(){

        String out = "";
        int a;

        System.out.println("Choose the vehice you want to calculate the total sale price \n" + parking.showVehicles());
        a = sc.nextInt();
        sc.nextLine();

        System.out.println("El precio de venta es: " + parking.calculateTotalSalePrice(a) + "\n");

        return out;
    }

    public String generateReport(){

        String out = "";

        System.out.println(parking.showReport());

        return out;
    }

    public String searchId(){

        String out = "";
        String id = "";

        System.out.println("Enter the id of the vehicle you want to search");
        id = sc.nextLine();

        System.out.println(parking.vehicleId(id));

        return out;
    }

    public String printParkingMap(){

        String out = "";

        System.out.println(parking.printMap());

        return out;
    }

    public String parkingReports(){

        String out = "";
        int b;
        boolean c=true;

        do{
            System.out.println("Pick an option: " + "\n"+
                           "(1) Listado de vehiculos y su informacion en un rango de agnos" + "\n"+
                           "(2) Datos del vehiculo mas antiguo y mas nuevo" + "\n" +
                           "(3) Porcentaje de ocupacion del parqueadero" + "\n");
            b = sc.nextInt();
            sc.nextLine(); 

            switch(b){

               case 1:
                   System.out.println(parking.carList());
                   c=false;
                   break;
                case 2: 
                    System.out.println(parking.oldestAndNewer());
                    c=false;
                    break;
                case 3:
                    double a;
                    a=(parking.parkingOcupation()/50*100);
                    System.out.println("The ocupation percentage of the parking lot is: " + a + "%");
                    c=false;
                   break;  
                default:
                   System.out.println("Wrong option");      
            }
        }while(c);

        return out;
    }

}
