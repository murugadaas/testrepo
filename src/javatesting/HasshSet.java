package javatesting;

import java.util.HashSet;


public class HasshSet {
    public static void main(String args[]) {
        /* This is how to declare HashSet */
        HashSet < String > hset =
            new HashSet < String > ();
        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");

        hset.add(null);
        //Displaying HashSet elements
        System.out.println(hset);
    }
}