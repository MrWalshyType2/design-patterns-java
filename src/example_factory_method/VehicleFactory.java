package example_factory_method;

public class VehicleFactory {

	public Vehicle getVehicle(String type) {
		if (type.equalsIgnoreCase("CAR")) {
			return new Car();
		} else if (type.equalsIgnoreCase("MOTORBIKE")) {
			return new Motorbike();
		}
		return null;
	}
}
