package example_abstract_factory;

public class App {

	public static void main(String args[]) {
		VehicleFactory vf = new ConcreteVehicleFactory();
		
		// The VehicleFactory handles instantiation of the concrete classes,
		// we just tell it what we need
		Engine engine = vf.getEngine("V8");
		Exhaust exhaust = vf.getExhaust("catback");
		
		System.out.println(engine.getInfo());
		System.out.println(exhaust.getInfo());
	}
}
