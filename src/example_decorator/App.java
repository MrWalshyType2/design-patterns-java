package example_decorator;

public class App {

	public static void main(String args[]) {
		
		// Bad example as not much varies, only cost
		System.out.println("" + new CaramelDecorator(new Coffee()).getCost());
	}
}
