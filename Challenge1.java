package Challenge3;

import java.util.Arrays;
import java.util.List;

public class Challenge1 {
	private List<Studant> studants;
	private double avg;
	
	public void fillList() {
		Studant s1 = new Studant("Bruno", 170.0f, 14);
		Studant s2 = new Studant("Leonardo", 174.0f, 21);
		Studant s3 = new Studant("Juan", 156.0f, 12);
		Studant s4 = new Studant("Juliana", 166.0f, 13);
		Studant s5 = new Studant("Wagner", 184.0f, 17);
		Studant s6 = new Studant("Micaela", 172.0f, 18);
		Studant s7 = new Studant("Bento", 150.0f, 14);
		Studant s8 = new Studant("Lucia", 162.0f, 13);
		Studant s9 = new Studant("Pedro", 169.0f,14);
		Studant s10 = new Studant("Carla", 158.0f, 16);

		studants = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);
	}
	
	public int returnOver13shorterThanAverage() {
		int cont = 0;
		
		for(Studant s : studants) {
			if(13 <= s.getAge() && getAvgHeight() > s.getHeight()) {
				cont++;
			}
		}
		
		return cont;
	}
	
	public double getAvgHeight() {
		double sum = 0.0f;
		
		for(Studant s : studants) {
			sum += s.getHeight();
		}
		
		avg = sum / studants.size();
		
		return avg;
	}

}
