package example.singleton.garage;

public class Mechanic implements Worker {
	
	private String name;
	private int age;
	
	public Mechanic() {
		
	}
	
	public Mechanic(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void getInfo() {
		System.out.println("MECHANIC: " + this.name + ", AGE: " + this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
