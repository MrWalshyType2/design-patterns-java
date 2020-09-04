package example.factory;

import com.sun.istack.internal.Nullable;

import example.factory.interfaces.Computer;
import example.factory.models.PC;
import example.factory.models.Server;
import example.factory.models.Smartphone;

// Can be a singleton or use a static method to return a sub-class of Computer
public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu, @Nullable String displaySize) {
		
		if (type.equalsIgnoreCase("PC")) { return new PC(ram, hdd, cpu); }
		else if (type.equalsIgnoreCase("Server")) { return new Server(ram, hdd, cpu); }
		else if (type.equalsIgnoreCase("Smartphone")) { return new Smartphone(ram, hdd, cpu, displaySize); }
		
		return null;
	}
}
