package example_adapter;

public class App {

	public static void main(String[] args) {
		
		ITarget adapter = new Adapter(new Adaptee());
		adapter.request();
	}
}
