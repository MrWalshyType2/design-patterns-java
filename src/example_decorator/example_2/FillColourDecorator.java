package example_decorator.example_2;

public class FillColourDecorator extends ShapeDecorator {
	
	protected Colour colour;

	public FillColourDecorator(Shape decoratedShape, Colour colour) {
		super(decoratedShape);
		this.colour = colour;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Fill Colour: " + colour);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
	}

	@Override
	public String info() {
		return decoratedShape.info() + " filled with " + colour + " colour";
	}

	@Override
	public boolean isHide() {
		return decoratedShape.isHide();
	}

}
