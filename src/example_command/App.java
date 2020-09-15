package example_command;

public class App {

	public static void main(String args[]) throws InterruptedException {
		
		Light livingRoomLight = new Light();
		
		// The RemoteControl has two commands that act on the supplied Light
		RemoteControl lightController = new RemoteControl(new LightOnCommand(livingRoomLight),
				new LightOffCommand(livingRoomLight));
		
		System.out.println("Entering the living room... Let's turn the light on!");
		lightController.on();
		lightController.printCommandHistory();
		
		System.out.println();
		Thread.sleep(1000);
		
		System.out.println("Leaving the living room... Let's turn the light off!");
		lightController.off();
		
		lightController.printCommandHistory();
		
		System.out.println();
		System.out.println("Undoing the light off command");
		lightController.undo(); // Undo the last command
		lightController.printCommandHistory(); // LightOffCommand is removed from history
	}
}
