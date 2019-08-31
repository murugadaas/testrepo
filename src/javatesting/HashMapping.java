package javatesting;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMapping {
    public static void main(String args[]) {
        /* This is how to declare HashMap */
        HashMap < Integer, String > hmap = new HashMap < Integer, String > ();
        //Adding elements to HashMap/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        /* Display content using Iterator*/
        Iterator i = hmap.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry e = (Map.Entry)i.next();
            System.out.println("key is: " + e.getKey() + " & Value is: " + e.getValue());
        }

        /* Get values based on key*/
        String
        var = hmap.get(2);
        System.out.println("Value at index 2 is: " +
            var);
        /* Remove values based on key*/
        hmap.remove(3);
        System.out.println("Map key and values after removal:");
        i = hmap.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry e = (Map.Entry)i.next();
            System.out.println("key is: " + e.getKey() + " & Value is: " + e.getValue());
        }
    }
}
