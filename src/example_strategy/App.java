package example_strategy;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// Create a sub-type of Car
		Car mazda = new Mazda("RX-7", 4);
		Car toyota = new Toyota("88C-V", 4);
		
		// Set a sub-type of Engine on the mazda at runtime
		mazda.setEngine(new RotaryEngine());
		toyota.setEngine(new V8Engine());
		
		// Try to drive the mazda
		mazda.drive();
		
		// Turn engine on and drive
		System.out.println("\nTurning the engine on...");
		mazda.providePower();
		toyota.providePower();
		
		Thread.sleep(2000);
//		mazda.drive();
		toyota.drive();
		Thread.sleep(2000);
		toyota.displayInfo();
	}

}
