package example.singleton;

// NOT THREAD SAFE (Conflicts arise that destroy the singleton pattern from multiple threads)
public class LazyInitialisation {

	// Instance created in global-access method
	private static LazyInitialisation instance;
	
	private LazyInitialisation() {}
	
	public LazyInitialisation getInstance() {
		if (instance == null) {
			instance = new LazyInitialisation();
		}
		return instance;
	}
}
