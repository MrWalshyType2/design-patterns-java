package example_abstract_factory;

public class ConcreteVehicleFactory implements VehicleFactory {

	@Override
	public Engine getEngine(String engine) {
		if (engine.equalsIgnoreCase("V8")) {
			return new V8Engine(4000, "Hemi V8");
		}
		return null;
	}

	@Override
	public Exhaust getExhaust(String exhaust) {
		if (exhaust.equalsIgnoreCase("CATBACK")) {
			return new CatBack("Cat-back");
		}
		return null;
	}

}
