package collections;

import java.util.Hashtable;

public class HashTests {
	
	
	public static void main (String args[]) {
		
		// Hashtable concepts
		
		Hashtable h = new Hashtable();
			
		h.put("s", "volvo");
		h.put("s", "volvo");
		h.put("s", "bmw");
		h.put("f", "volvo");
	
		h.put("f", "nbenz");
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.get("f"));
		
		Hashtable<String,String> r = new Hashtable<String,String>();
		r.put("make", "volvo");
		r.put("1", "maryti");
		
		System.out.println(r.get("1"));
		System.out.println(r.get("make"));
		
		
		Hashtable<Integer,Integer > fre = new Hashtable<Integer,Integer>();
		fre.put(1, 100);
		System.out.println(fre.get(1));
	
		
	}



}
