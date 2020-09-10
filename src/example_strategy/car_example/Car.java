package example_strategy.car_example;

public abstract class Car {
	// Ref var for the Engine interface (super-type)
	// The engine is interchangeable
	public Engine engine;
	boolean power;
	int wheels;
	String model;
	
	public Car(String model, int wheels) {
		this.model = model;
		this.wheels = wheels;
	}
	
	public abstract void displayInfo();
	
	// Behaviour is implemented by the specific engine implementation
	public void drive() {
		try {
			if (this.hasPower()) {
				engine.applyThrottle();
			} else {
				System.out.println("Engine has no power");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void printEngineSensorReadings() {
		System.out.println(this.engine.getSensorReadings());
	}
	
	public boolean hasPower() {
		return this.power;
	}
	
	public void providePower() {
		this.power = true;
	}
	
	public void killPower() {
		this.power = false;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}