package example_singleton;

public class App {

	public static void main(String args[]) {
		
		Boolean connection = DatabaseConnection.getConnection();
		System.out.println("Connected: " + connection);
	}
}
