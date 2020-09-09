package example.adapter;

// Interface for creating class with different values,
// can also be an abstract class
public interface SocketAdapter {
	
	public Volt get120Volt();
	
	public Volt get12Volt();
	
	public Volt get3Volt();
}
