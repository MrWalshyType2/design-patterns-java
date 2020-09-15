package example_singleton;

// Singleton class to maintain a single db connection
public class DatabaseConnection {
	
	private static Boolean connection;
	
	private DatabaseConnection() {
		
	}

	public static Boolean getConnection() {
		// Double locking
		if (connection == null) {
			synchronized (DatabaseConnection.class) {
				if (connection == null) {
					connection = true;
				}
			}
		}
		return connection;
	}
}
