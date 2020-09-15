package example_decorator.example_2;

// Abstract so it does not have to implement the methods in Shape
// ShapeDecorator is a Shape
public abstract class ShapeDecorator implements Shape {

	// ShapeDecorator has a shape
	protected Shape decoratedShape;
	
	// Constructor injection for composition
	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}
}
