package example.abstract_factories.subs;

import example.abstract_factories.supers.Computer;

public class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	public Server() {}
	
	public Server(String ram, String hdd, String cpu) {
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
		return "SERVER: " + this.ram + " RAM, " + this.hdd + " HDD, " + this.cpu + " CPU.";
	}
}
