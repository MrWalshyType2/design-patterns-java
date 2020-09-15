package example_abstract_factory;

public abstract class Engine {

	protected int cc;
	protected String model;
	
	public abstract String getInfo();
	
	public Engine(int cc, String model) {
		super();
		this.cc = cc;
		this.model = model;
	}
}
