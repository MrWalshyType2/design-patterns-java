package example.abstract_factories;

import example.abstract_factories.supers.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
