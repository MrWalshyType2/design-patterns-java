package example.builder;

import example.builder.Computer.ComputerBuilder;

public class App {

	public static void main(String[] args) throws InterruptedException {
		/////////////////////////////////////////////////////////////////////////////////////////////////
		// An instance of Computer created by the static nested class ComputerBuilder
		System.out.println("BASIC COMPUTER");
		Computer computer = new Computer.ComputerBuilder("1 TB", "16 GB").build();
		System.out.println(computer);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\nLooks like this customer wants a graphics card, lets grab the hdd and ram first.");
		// The builder can build in stages by storing it in an instance of the builder
		ComputerBuilder cb = new Computer.ComputerBuilder("500 GB", "32 GB");
		System.out.println(cb.build().toString());
		
		// Looks like a graphics card needs to be added, lets grab that now!
		System.out.println("Time to find the graphics card..."); Thread.sleep(2000);
		System.out.println("Searching the shelves... *Enter elevator music*"); Thread.sleep(3000);
		
		cb.setGraphicsCardEnabled(true);
		System.out.println("Ahh, a shiny new graphics card!"); Thread.sleep(1000);
		
		// Lets finish off by building the Computer
		System.out.println("Time to build!"); Thread.sleep(2000);
		Computer computer2 = cb.build();
		System.out.println(computer2);
		
	}
}
