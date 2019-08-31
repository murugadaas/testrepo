package collections;

import java.util.LinkedList;

public class LinkedListex {
	public static void main(String args[]) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("tata");
		ll.add("tm");
		ll.add("cts");
		ll.add("google");
		System.out.println(ll);
		// adding 1st abd last 
		ll.addFirst("fuuu");
		ll.addLast("endd");
		System.out.println("&&&&&&&&");
		
		ll.set(1, "starting");
		System.out.println(ll);
		for(String str : ll) {
			System.out.println("print by using advance forr loop"+str);
		}

//// removing 1st and last
		
		ll.removeFirst();
		ll.removeLast();
		
		
		// remove particalar. .remove(index)
		
		ll.remove(1);
		System.out.println(ll);
		
		
		
		///   iterate throug all the element by using advance for loop
		
		System.out.println("printing using advance for loop");
		
		for(String str : ll) {
			System.out.println(str);
		}
	}
	
}
