import java.util.Scanner;

public class Challenge3 {
	private FuelPump fuelPump = new FuelPump();
	private Scanner read = new Scanner(System.in);
	
	public void setupFuelPump() {
		fuelPump.setfuelQuantity(500.0f);
		fuelPump.setfuelPrice(5.0f);
	}
	
	public void fillWithLiters() {
		System.out.println("Type how many liters do you want to fill in");
		double liters = read.nextDouble();
		System.out.println("Your cost was: " + fuelPump.fillWithLiters(liters));		
	}
	
	public void fillWithPrice() {
		System.out.println("Type how much do you want to fill in");
		double price = read.nextDouble();
		System.out.println(fuelPump.fillWithPrice(price) + " liters were filled in");
	}
	
	public void setPrice() {
		System.out.println("What fuel do you want do set up the price?");
		System.out.println("[1] STANDARD | [2] PREMIUM | [3] DIESEL | [4] ALCOHOL");
		int fueltype = read.nextInt();
		
		System.out.println("Type the new price");
		double price = read.nextDouble();
		
		switch(fueltype){
		case 1: 
			fuelPump.setPrice(FuelType.STANDARD, price);
			System.out.println("The new price of " + FuelType.STANDARD + " was set");
			break;
						
		case 2:
			fuelPump.setPrice(FuelType.PREMIUM, price);
			System.out.println("The new price of " + FuelType.PREMIUM + " was set");
			break;
		
		case 3:
			fuelPump.setPrice(FuelType.DIESEL, price);
			System.out.println("The new price of " + FuelType.DIESEL + " was set");
			break;
			
		case 4:
			fuelPump.setPrice(FuelType.ALCOHOL, price);
			System.out.println("The new price of " + FuelType.ALCOHOL + " was set");
			break;
		}
		
		
	}

}