package example.abstract_factories.factories;

import example.abstract_factories.ComputerAbstractFactory;
import example.abstract_factories.subs.Server;
import example.abstract_factories.supers.Computer;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new Server(ram, hdd, cpu);
	}
}
