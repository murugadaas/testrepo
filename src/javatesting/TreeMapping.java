package javatesting;

import java.util.TreeMap;

import java.util.Iterator;
import java.util.Map;

public class TreeMapping {
	public static void main(String args[]) {
		/* This is how to declare TreeMap */
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		// Adding elements to TreeMap/
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");

		/* Display content using Iterator */
		Iterator i = tmap.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry e = (Map.Entry) i.next();
			System.out.println("key is: " + e.getKey() + " & Value is: " + e.getValue());
		}

	}
}
