package example.singleton;

// Make the access method synchronised, this means only one thread can ever use it
// Lazy initialisation
public class ThreadSafe {

	private static ThreadSafe instance;
	
	private ThreadSafe () {};
	
	// synchronized method is costly
	public static synchronized ThreadSafe getInstance() {
		if (instance == null) {
			instance = new ThreadSafe();
		}
		return instance;
	}
	
	// double-checked locking
	public static ThreadSafe getInstanceUsingDoubleLocking() {
		if (instance == null) {
			// Make thread safe (only one can use)
			synchronized (ThreadSafe.class) {
				// Only allow creation of one instance
				if (instance == null) {
					instance = new ThreadSafe();
				}
			}
		}
		return instance;
	}
}
