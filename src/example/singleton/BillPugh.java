package example.singleton;

// This method does not require synchronisation
// Prior to Java 5, this was necessary to ensure thread safety as if too many
// people tried to get an instance, the memory model would fail as it suffered numerous bugs apparently
public class BillPugh {
	// When the BillPugh singleton class is loaded, the SingletonHelper inner static class
	// is not loaded into memory. The inner helper class is only loaded when someone calls
	// the public 'getInstance()' method which then loads the class, creates the instance, and is returned
	// from the method.
	
	private BillPugh() {}
	
	// Using an inner static helper class
	private static class SingletonHelper {
		private static final BillPugh INSTANCE = new BillPugh();
	}
	
	public static BillPugh getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
