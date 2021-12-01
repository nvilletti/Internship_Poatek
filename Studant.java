public class Studant {
	private String name;
	private double height;
	private int age;
	
	public Studant(String name, double height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}
