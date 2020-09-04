package example.abstract_factories;

import example.abstract_factories.supers.Computer;

public interface ComputerAbstractFactory {

	// Returning the super type of Computer
	//     - Factory classes will implement this interface and
	//	     return their respective sub-class.
	public Computer createComputer();
}
