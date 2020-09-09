package example.adapter;

// Uses inheritance, extends the source interface (Socket class)
public class SocketClassAdapter extends Socket implements SocketAdapter {

	@Override
	public Volt get120Volt() {
		return getVolt(); // getVolt() is inherited from Socket
	}

	@Override
	public Volt get12Volt() {
		Volt volts = getVolt();
		return convertVolt(volts, 10); // 120 / 10 = 12 volts
	}

	@Override
	public Volt get3Volt() {
		Volt volts = getVolt();
		return convertVolt(volts, 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}
}
