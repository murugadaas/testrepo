package javatesting;

import java.util.*;
public class VectorExample {
    public static void main(String args[]) {
        /* Vector of initial capacity(size) of 2 */
        Vector < String > vec = new Vector < String > (2);
        /* Adding elements to a vector*/
        vec.add("1");
        vec.add("2");
        vec.add("3");
        vec.add("4");
        /* check size and capacityIncrement*/
        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity increment is: " + vec.capacity());
        vec.addElement("fruit1");
        vec.addElement("fruit2");
        vec.addElement("fruit3");
       //size and capacityIncrement after two insertions/
       //Display Vector elements/
        System.out.println("Size after addition: " + vec.size());
        System.out.println("Capacity after increment is: " + vec.capacity());
    }
}
