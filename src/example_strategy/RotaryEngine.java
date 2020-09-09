package example_strategy;

class RotaryEngine implements Engine {

	@Override
	public void applyThrottle() {
		System.out.println("Accelerating...");
	}

	@Override
	public String getSensorReadings() {
		return "Fuel Level: 66%, Current speed: 57 mph";
	}
}
