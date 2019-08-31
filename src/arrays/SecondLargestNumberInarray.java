package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumberInarray {

		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
		      System.out.println("Enter the length of the array:");
		      int length = s.nextInt();
		      int  array[] = new int[length];
		      System.out.println("Enter the elements of the array:");
		      for(int i=0; i<length; i++ ) {
		         array[i] = s.nextInt();
		      }
			
			// int array[] = {10, 20, 25, 63, 96, 57,897,900};
		      int size = array.length;
		      Arrays.sort(array);
		      System.out.println("sorted Array ::"+Arrays.toString(array));
		      int res = array[(size-3)];
		      System.out.println("3nd largest element is ::"+res);
		   }
		}