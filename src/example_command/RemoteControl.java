package example_command;

import java.util.ArrayList;

public class RemoteControl {

	private Command on;
	private Command off;
	
	private ArrayList<Command> commandHistory = new ArrayList<Command>();
	
	public RemoteControl(Command on, Command off) {
		this.on = on;
		this.off = off;
	}
	
	public void setOnCommand(Command command) {
		on = command;
	}
	
	public void setOffCommand(Command command) {
		off = command;
	}
	
	public void on() {
		this.commandHistory.add(this.on);
		this.on.execute();
	}
	
	public void off() {
		this.commandHistory.add(this.off);
		this.off.execute();
	}
	
	public void undo() {
		Command lastExecuted = commandHistory.get(commandHistory.size() - 1);
		lastExecuted.undo();
		commandHistory.remove(lastExecuted);
	}
	
	public void printCommandHistory() {
		System.out.println(this.commandHistory);
	}
}
