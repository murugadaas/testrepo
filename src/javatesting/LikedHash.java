package javatesting;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class LikedHash {
    public static void main(String args[]) {
        /* This is how to declare LinkedHashMap */
        LinkedHashMap < Integer, String > lhmap =
            new LinkedHashMap < Integer, String > ();
        //Adding elements to LinkedHashMap
        lhmap.put(22, "Abey");
        lhmap.put(33, "Dawn");
        lhmap.put(1, "Sherry");
        lhmap.put(2, "Karon");
        lhmap.put(100, "Jim");
        // Generating a Set of entries
        Set set = lhmap.entrySet();
        // Displaying elements of LinkedHashMap
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry e = (Map.Entry) i.next();
            System.out.println("key is: " + e.getKey() + "& Value is: " + e.getValue());
        }

    }
}