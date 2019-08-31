package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExam {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();

		
		
		map.put(1, "Cars");
		map.put(1, "Cagg");
		map.put(2, "buds");
		System.out.println(map);
	
	for (Entry m : map.entrySet()) {
		
		System.out.println(m.getKey()+ " " + m.getValue());
	}
	}

	
}
