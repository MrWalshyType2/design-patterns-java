package example_observer;

import java.util.ArrayList;

public class WeatherStation implements Observable {
	
	// Keeps track of observers observing the observable
	ArrayList<Observer> observers = new ArrayList<Observer>();
	
	int temperature = 32;

	@Override
	public void add(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// Iterate over observers to update them
		observers.forEach((observer) -> {
			observer.update();
		});
	}
	
	public void setTemperature(int temp) {
		this.temperature = temp;
		this.notifyObservers();
	}

	public int getTemperature() {
		return this.temperature;
	}
	
}
