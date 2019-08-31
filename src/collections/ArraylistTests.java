package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistTests {

	public static void main(String args[]) {

		ArrayList ar = new ArrayList();

		ar.add(188);
		ar.add("ig");
		ar.add(188);
		ar.add(188);
		ar.add(188);

		System.out.println(ar.get(1) + "    ***");
		System.out.println(ar.size());
		// ar.remove(2);

		System.out.println("Size After deletion = " + ar.size());

		ar.add("hh188" + " gggs ");
		ar.add("8dgh");

		// to print all array using for loop
		for (int i = 0; i < ar.size(); i++) {

			System.out.println(ar.get(i));

		}

		// to store class objects
		// creating employee class objects
		Employee emp = new Employee("veee", 27, "engg");
		Employee emp1 = new Employee("vedd", 27, "mzt");
		Employee emp3 = new Employee("vf", 27, "chen");

		// creating array lists

		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(emp1);
		arr.add(emp);
		arr.add(emp3);
		
		
		// iterator to traverse the values
		// create a iterator method using the object
		
		Iterator<Employee> iter =arr.iterator();
		while(iter.hasNext()) {
			
			Employee details = iter.next();
			
			System.out.println(details.age);
			System.out.println(details.name);
			System.out.println(details.dept);
		}
		
		System.out.println("______________________________________________________________");
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		
		ar2.add(100);
		ar2.add(300);
		
		ArrayList<Integer> ar4 = new ArrayList<Integer>();
		ar4.add(100);
		ar4.add(900);
		
		ar2.addAll(ar4);
		
		
		// to print single array 
		
		System.out.println(ar2.get(1));
		System.out.println("*********************");
		
		// to print single all array 
		
		for(int i =0; i<ar2.size(); i++) {
			System.out.println(ar2.get(i));
			
		}
		System.out.println("*********************");
	// to delete all or reatain
		
		ar2.retainAll(ar4);
		for(int i =0; i<ar2.size(); i++) {
			System.out.println(" after deletion"+ar2.get(i));
	}
	
	
}}
