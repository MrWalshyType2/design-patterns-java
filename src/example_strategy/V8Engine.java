package example_strategy;

public class V8Engine implements Engine {

	@Override
	public String getSensorReadings() {
		return "Fuel Level: 78%, Current speed: 217 mph";
	}

	@Override
	public void applyThrottle() {
		System.out.println("Accelerating with brute force...");
	}

}
