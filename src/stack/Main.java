package stack;

import stack.Employee;

public class Main {

	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		
		Employee janeJones = new Employee ("Jane", "Jones", 123);
		Employee johnDoe = new Employee ("John", "Doe", 456);
		Employee marySmith = new Employee ("Mary", "Smith", 789);
		Employee mikeWilson = new Employee ("Mike", "Wilson", 1234);
		
		stack.push(janeJones);
		stack.push(johnDoe);
		stack.push(marySmith);
		stack.push(mikeWilson);

		System.out.println(stack.peek()); 
		stack.printStack();

	}

}
