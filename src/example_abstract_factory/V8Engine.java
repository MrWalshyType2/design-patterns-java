package example_abstract_factory;

public class V8Engine extends Engine {

	public V8Engine(int cc, String model) {
		super(cc, model);
	}

	@Override
	public String getInfo() {
		return "Engine model: " + this.model + ", CC: " + this.cc;
	}

}
