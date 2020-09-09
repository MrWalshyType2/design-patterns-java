package example_strategy;

public class Mazda extends Car {

	public Mazda(String model, int wheels) {
		super(model, wheels);
	}

	@Override
	public void displayInfo() {
		System.out.println("Mazda " + this.model);
		System.out.println("Engine has power: " + this.hasPower());
		System.out.println("Wheels: " + this.wheels);
	}

}
