public class App {
	 public static void main (String args[]) {
		System.out.println("~~~~~~ CHALLENGE 1 ~~~~~~");
		System.out.println("");
		Challenge1 c1 = new Challenge1();
		c1.fillList();
		System.out.println(c1.returnOver13shorterThanAverage() + " students are over the age of 13 and shorter than the average height of those students.");	
		System.out.println("");
		 
		System.out.println("~~~~~~ CHALLENGE 2 ~~~~~~");
		System.out.println("");
		Challenge2 c2 = new Challenge2();
		c2.getReverse();
		System.out.println("");
		 
		System.out.println("~~~~~~ CHALLENGE 3 ~~~~~~");
		Challenge3 c3 = new Challenge3();
		c3.setupFuelPump();
		c3.fillWithLiters();
		c3.fillWithPrice();
		c3.setPrice();
		System.out.println("");
	 }
}