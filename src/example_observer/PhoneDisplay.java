package example_observer;

public class PhoneDisplay implements Observer, Display {
	
	WeatherStation station;
	int temperature;

	public PhoneDisplay(WeatherStation station) {
		this.station = station;
	}

	@Override
	public void display() {
		System.out.println("Temperature: " + this.temperature + "C");
	}

	@Override
	public void update() {
		this.temperature = this.station.getTemperature();
		this.display();
	}

}
