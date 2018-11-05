package queues;

import queues.Employee;

public class Main {

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 456);
		Employee marySmith = new Employee("Mary", "Smith", 789);
		Employee mikeWilson = new Employee("Mike", "Wilson", 1234);
		
		ArrayQueue queue = new ArrayQueue(10);
		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);
		queue.add(mikeWilson);
		
//		queue.printQueue();
		queue.remove();

		queue.printQueue();
	}

}
