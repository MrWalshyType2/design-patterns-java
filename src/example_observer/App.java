package example_observer;

public class App {

	public static void main(String[] args) {
		
		// Observable
		WeatherStation station = new WeatherStation();
		
		// Observers
		PhoneDisplay display = new PhoneDisplay(station);
		AlexaDisplay display2 = new AlexaDisplay(station);
		
		// Add observers to observable
		station.add(display);
		station.add(display2);
		
		// Trigger Observable station to update observables
		station.setTemperature(47);
	}

}
