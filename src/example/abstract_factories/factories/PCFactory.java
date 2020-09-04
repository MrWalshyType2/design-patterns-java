package example.abstract_factories.factories;

import example.abstract_factories.ComputerAbstractFactory;
import example.abstract_factories.subs.PC;
import example.abstract_factories.supers.Computer;

public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram, hdd, cpu);
	}
}
