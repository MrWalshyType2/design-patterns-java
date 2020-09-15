package example_decorator;

public class CaramelDecorator extends AddonDecorator {
	// Caramel is a Beverage and has a Beverage
	Beverage beverage;
	
	public CaramelDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		// Take the cost of the Beverage being wrapped, such as a Coffee, and then
		// add the cost of this Beverage implementation by proxy
		return this.beverage.getCost() + 1;
	}

}
