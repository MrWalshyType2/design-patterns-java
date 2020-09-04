package example.singleton;

// Similar to EagerInitialisation (created before usage)
// Allows exception handling
public class StaticBlock {

	private static StaticBlock instance;
	
	private StaticBlock() {}
	
	// static block initialisation for exception handling
	static {
		try {
			instance = new StaticBlock();
		} catch(Exception e) {
			throw new RuntimeException("Exception occurred while creating singleton instance");
		}
	}
	
	public static StaticBlock getInstance() {
		return instance;
	}
}
