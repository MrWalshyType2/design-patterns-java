package example.factory.models;

import example.factory.interfaces.Computer;

public class PC implements Computer {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC() {}
	
	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
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
	public String toString() {
		return "PC: " + this.ram + " RAM, " + this.hdd + " HDD, " + this.cpu + " CPU.";
	}

}
