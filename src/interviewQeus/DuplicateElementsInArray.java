package interviewQeus;

import java.util.Scanner;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int  myArray[] = new int[length];
	      System.out.println("Enter the elements of the array:");
	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }
	 
	        for (int i = 0; i < myArray.length-1; i++)
	        {
	            for (int j = i+1; j < myArray.length; j++)
	            {
	                if( (myArray[i]==(myArray[j])) && (i != j) )
	                {
	                    System.out.println("Duplicate Element is : "+myArray[j]);
	                }
	            }
	        }
	    }    
	}