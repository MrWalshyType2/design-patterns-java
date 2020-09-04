package example.singleton;

// Does not allow exception handling
// Created before usage (usually not the best option)
public class EagerInitialisation {

	// Private instance declared at class load
	private static final EagerInitialisation instance = new EagerInitialisation();
	
	// Private constructor to prevent client access
	private EagerInitialisation() {};
	
	public static EagerInitialisation getInstance() {
		return instance;
	}
}
