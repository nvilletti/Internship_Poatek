import java.util.Scanner;

public class Challenge2 {
		
	public Challenge2(){
		
	}
	
	public int readKeyboard() {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Type an integer number");
		int number = read.nextInt();
		return number;
	}
	
	public void getReverse() {
		String s = Integer.toString(readKeyboard());
		String reverse = new String();
		
		for(int i = s.length() - 1 ; i >= 0 ;i--) {
			reverse = reverse + Character.toString(s.charAt(i));
		}
		
		System.out.println(reverse);
	}
	
}
