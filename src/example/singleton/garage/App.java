package example.singleton.garage;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String args[]) {
		
		Database db = Database.getInstance("localhost:27000");
		db.connect();
		
		Garage garage = new Garage();
		
		Mechanic dave = new Mechanic("Dave", 47);
		Mechanic junior = new Mechanic("Dave jr", 25);
		
		List<Mechanic> mechanics = Arrays.asList(dave, junior);
		
		garage.setMechanics(mechanics);
		garage.getMechanics().forEach(mechanic -> mechanic.getInfo());
	}
}
