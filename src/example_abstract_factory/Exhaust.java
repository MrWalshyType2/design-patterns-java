package example_abstract_factory;

public abstract class Exhaust {
	
	protected String model;
	
	public abstract String getInfo();

	public Exhaust(String model) {
		super();
		this.model = model;
	}

}
