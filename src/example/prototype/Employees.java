package example.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> list;
	
	public Employees() {
		
		list = new ArrayList<String>();
	}
	
	public Employees(List<String> list) {
		
		this.list = list;
	}
	
	public void load() {
		// Read employees from db, then load into list (mocking)
		list.add("Fred");
		list.add("Bobbyo");
	}
	
	public List<String> getList() {
		
		return list;
	}

	// Provides a deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		List<String> temp = new ArrayList<String>();
		
		for (String s : this.list) {
			temp.add(s);
		}
		return new Employees(temp);
	}
	
	
}
