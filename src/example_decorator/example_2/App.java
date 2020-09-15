package example_decorator.example_2;

public class App {

	public static void main(String args[]) {
		
		Shape circle = new ConcreteCircle();
		
		System.out.println("Drawing a circle...");
		circle.draw();
		System.out.println();
		
		// The Decorators act like a chain (order does not matter)
		System.out.println("Creating a circle with a green colour, red lines and a dash style.");
		Shape decoratedCircle = new FillColourDecorator(
								new LineColourDecorator(
								new LineStyleDecorator(
								new ConcreteCircle(), LineStyle.DASH), Colour.RED), Colour.GREEN);
		decoratedCircle.draw();
		System.out.println();
		
		// The object can be built with separate statements
		System.out.println("Building a circle with red fill and dashed lines");
		FillColourDecorator redFill = new FillColourDecorator(new ConcreteCircle(), Colour.RED);
		LineStyleDecorator redFillDashedLines = new LineStyleDecorator(redFill, LineStyle.DASH);
		Shape prebuiltCircle = redFillDashedLines;
		System.out.println(prebuiltCircle.info());
		prebuiltCircle.draw();
	}
}
