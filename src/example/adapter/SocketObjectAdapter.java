package example.adapter;

// Uses Java Composition, adapter contains the source object
public class SocketObjectAdapter implements SocketAdapter {

	// Composition for adapter pattern
	private Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt volts = socket.getVolt();
		return convertVolt(volts, 10); // 120 / 10 = 12 volts
	}

	@Override
	public Volt get3Volt() {
		Volt volts = socket.getVolt();
		return convertVolt(volts, 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}
	
}
