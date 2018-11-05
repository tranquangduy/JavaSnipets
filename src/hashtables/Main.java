package hashtables;

import hashtables.Employee;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee ("Jane", "Jones", 123);
		Employee johnDoe = new Employee ("John", "Doe", 456);
		Employee marySmith = new Employee ("Mary", "Smith", 789);
		Employee mikeWilson = new Employee ("Mike", "Wilson", 1234);
		
		SimpleHashtable ht = new SimpleHashtable();
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Smith", marySmith);
		ht.put("Wilson", mikeWilson);
		
		ht.printHashtable();
		
		System.out.println(ht.get("Jones"));
		
		ht.remove("Wilson");
		ht.remove("Doe");
		
		ht.printHashtable();
		

	}

}
