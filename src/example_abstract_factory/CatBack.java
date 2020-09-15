package example_abstract_factory;

public class CatBack extends Exhaust {

	public CatBack(String model) {
		super(model);
	}

	@Override
	public String getInfo() {
		return "Exhaust model: " + model;
	}

}
