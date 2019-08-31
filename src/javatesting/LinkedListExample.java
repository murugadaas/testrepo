package javatesting;

import java.util.*;
public class LinkedListExample {
    public static void main(String args[]) {
        /* Linked List Declaration */
        LinkedList < String > linkedlist = new LinkedList < String > ();
       
        /*add(String Element) is used for adding
         * the elements to the linked list*/
        
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");
        
        //Display Linked List Content/
        System.out.println("Linked List Content: " + linkedlist);

       //Add First and Last Element/
        linkedlist.add(0, "First Item");
        linkedlist.add("Last Item");
        System.out.println("LinkedList Content after addition: " + linkedlist);
        
        //This is how to get and set Values/
        System.out.println("First element: " + linkedlist.get(0));
        linkedlist.set(0, "Changed first item");
        System.out.println("First element after update by set method: " + linkedlist.get(0));
        
        //Remove first and last element/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedlist);
        
        // Add to a Position and remove from a position*/
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " + linkedlist);
    }
    }