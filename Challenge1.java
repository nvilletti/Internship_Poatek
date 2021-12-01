
public class Challenge1 {
	private Studant studants[];
	private double avg;
	
	public Challenge1() {
		 studants = new Studant[10];
		 studants[0] = new Studant("Bruno", 170.0f, 14);
		 studants[1] = new Studant("Leonardo", 174.0f, 21);
		 studants[2] = new Studant("Juan", 156.0f, 12);
		 studants[3] = new Studant("Juliana", 166.0f, 13);
		 studants[4] = new Studant("Wagner", 184.0f, 17);
		 studants[5] = new Studant("Micaela", 172.0f, 18);
		 studants[6] = new Studant("Bento", 150.0f, 14);
		 studants[7] = new Studant("Lucia", 162.0f, 13);
		 studants[8] = new Studant("Pedro", 169.0f,14);
		 studants[9] = new Studant("Carla", 158.0f, 16);
		 avg = getAvgHeight();
	}
	
	public int returnOver13shorterThanAverage() {
		int cont = 0;
		for (int i = 0; i < studants.length; i++) {
			 if (13 <= studants[i].getAge() && avg > studants[i].getHeight()) {
				 cont++;
				}
		}
		return cont;
	}
	public double getAvgHeight() {
		double sum = 0.0f;
		for (int i = 0; i < studants.length; i++) {
			 sum = sum + studants[i].getHeight();			  
		}
		
		avg = sum/studants.length;
		return avg;
	}
	public void print() {
		System.out.println(studants.length);
	}

}
