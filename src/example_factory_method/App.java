package example_factory_method;

public class App {

	public static void main(String args[]) {
		
		VehicleFactory vf = new VehicleFactory();
		
		Vehicle car = vf.getVehicle("car");
		Vehicle motorbike = vf.getVehicle("motorbike");
		
		System.out.println(car.getType());
		System.out.println(motorbike.getType());
	}
}
