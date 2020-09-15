package example_decorator.example_2;

// Concrete class implementing Shape, ConcreteCircle is a shape
public class ConcreteCircle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}

	@Override
	public void resize() {
		System.out.println("Resizing a circle");
	}

	@Override
	public String info() {
		return "Circle obj";
	}

	@Override
	public boolean isHide() {
		return false;
	}

}
