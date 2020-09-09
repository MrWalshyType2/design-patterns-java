package example.prototype;

import java.util.List;

public class App {

	public static void main(String[] args) {

		Employees employees = new Employees();
		employees.load();
		
		Employees newEmployees = null;
		
		try {
			newEmployees = (Employees) employees.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		List<String> list = newEmployees.getList();
		list.add("Grognak");
		
		System.out.println("EMPLOYEE LIST:" + employees.getList());
		System.out.println("NEW EMPLOYEE LIST: " + list);
	}

}
