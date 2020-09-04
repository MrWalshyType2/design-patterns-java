package example.factory;

import example.factory.interfaces.Computer;

public class App {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer("pc", "16 GB", "512 GB", "i7 10th Gen", null);
		Computer server = ComputerFactory.getComputer("server", "128 GB", "10 TB", "Xeon", null);
		Computer smartphone = ComputerFactory.getComputer("smartphone", "4 GB", "64 GB", "Snapdragon", "5");
		
		System.out.println(pc);
		System.out.println(server);
		System.out.println(smartphone);
	}

}
