public class App {
	 public static void main (String[] args) {
		 
		Challenge1 c1 = new Challenge1();
		System.out.println(c1.returnOver13shorterThanAverage() + " students are over the age of 13 and shorter than the average height of those students.");	
		 
		Challenge2 c2 = new Challenge2();
		c2.getReverse();
		
		FuelPump fp = new FuelPump();
		fp.setfuelQuantity(500.0f);
		fp.setfuelPrice(5.5f);
		System.out.println(fp.fillWithLiters(5.0f));
		System.out.println(fp.fillWithPrice(100.0f));
		fp.setPrice(fuelType.DIESEL, 4.5f);
		fp.setfuelType(fuelType.DIESEL);
		System.out.println(fp.getfuelPrice());

	 }
}

