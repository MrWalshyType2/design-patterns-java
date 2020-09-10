package example_strategy.car_example;

public class Toyota extends Car {

	public Toyota(String model, int wheels) {
		super(model, wheels);
	}

	@Override
	public void displayInfo() {
		System.out.println("Toyota " + this.model);
		System.out.println("Engine has power: " + this.power);
		System.out.println("Wheels: " + this.wheels);
		this.printEngineSensorReadings();
	}

}
