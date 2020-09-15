package example_abstract_factory;

public interface VehicleFactory {

	Engine getEngine(String engine);
	Exhaust getExhaust(String exhaust);
}
