package example.abstract_factories;

import example.abstract_factories.factories.PCFactory;
import example.abstract_factories.factories.ServerFactory;
import example.abstract_factories.supers.Computer;

public class App {

	public static void main(String[] args) {
		
		testAbstractFactory();
	}

	private static void testAbstractFactory() {

		Computer pc = ComputerFactory.getComputer(new PCFactory("32 GB", "1 TB", "3.7 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("128 GB", "20 TB", "4.0 GHz"));
		
		System.out.println(pc);
		System.out.println(server);
	}
}
