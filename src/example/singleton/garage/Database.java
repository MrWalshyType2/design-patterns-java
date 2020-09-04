package example.singleton.garage;

public class Database {

	private static Database instance;
	
	private String url;
	
	private Database(String url) {
		this.url = url;
	}
	
	// Using double-checked locking
	public static Database getInstance(String url) {
		if (instance == null) {
			synchronized (Database.class) {
				if (instance == null) {
					instance = new Database(url);
				}
			}
		}
		return instance;
	}
	
	public void connect() {
		System.out.println("Connecting to db");
	}
}
