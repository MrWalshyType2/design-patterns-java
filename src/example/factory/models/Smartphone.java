package example.factory.models;

import example.factory.interfaces.Computer;
import example.factory.interfaces.Display;

public class Smartphone implements Computer, Display {

	private String ram;
	private String hdd;
	private String cpu;
	private String displaySize;
	
	public Smartphone() {}
	
	public Smartphone(String ram, String hdd, String cpu, String displaySize) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.displaySize = displaySize;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
	
	@Override
	public String getDisplaySize() {
		return this.displaySize;
	}

	@Override
	public String toString() {
		return "SMARTPHONE: " + this.ram + " RAM, " + this.hdd + " SD, " + this.cpu + " CPU, "
				+ this.displaySize + "\" Screen";
	}
}
