package example.singleton;

// Enumerable singletons overcome reflections as Java ensures only one enum is available (single instantiation)s
// Inflexible as they do not allow lazy initialisation
public enum EnumS {

	INSTANCE;
	
	public static void doSomething() {
		System.out.println("Contacting database...");
	}
}
