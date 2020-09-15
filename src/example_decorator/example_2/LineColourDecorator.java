package example_decorator.example_2;

public class LineColourDecorator extends ShapeDecorator {
	
	protected Colour colour;

	public LineColourDecorator(Shape decoratedShape, Colour colour) {
		super(decoratedShape);
		this.colour = colour;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line Colour: " + colour);
	}

	@Override
	public void resize() {
		decoratedShape.resize();
	}

	@Override
	public String info() {
		return decoratedShape.info() + " drawn with " + colour + " colour";
	}

	@Override
	public boolean isHide() {
		return decoratedShape.isHide();
	}

}
