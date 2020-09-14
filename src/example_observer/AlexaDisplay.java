package example_observer;

public class AlexaDisplay implements Observer, Display {
	
	WeatherStation station;
	
	int temperature;
	
	public AlexaDisplay(WeatherStation station) {
		this.station = station;
	}

	@Override
	public void display() {
		System.out.println("The temperature in Oklahoma is: " + this.temperature + "C");
	}

	@Override
	public void update() {
		this.temperature = this.station.getTemperature();
		display();
	}

}
