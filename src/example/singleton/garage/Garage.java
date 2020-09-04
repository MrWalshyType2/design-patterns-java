package example.singleton.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private String name;
	private String description;
	
	private List<Mechanic> mechanics = new ArrayList<Mechanic>();
	
	private Database garageDatabase;
	
	public Garage() {
		
	}
	
	public Garage(List<Mechanic> mechanics, Database garageDatabase) {
		this.mechanics = mechanics;
		this.garageDatabase = garageDatabase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Mechanic> getMechanics() {
		return mechanics;
	}

	public void setMechanics(List<Mechanic> mechanics) {
		this.mechanics = mechanics;
	}

	public Database getGarageDatabase() {
		return garageDatabase;
	}

	public void setGarageDatabase(Database garageDatabase) {
		this.garageDatabase = garageDatabase;
	}
	
}
