package interviewQeus;

import java.util.Arrays;
import java.util.Scanner;

public class Testall {
	
	public static void main(String args[]) {
		/*
		int array[] = {10, 20, 25, 63, 96, 57,897,900};
	      int size = array.length;
	      Arrays.sort(array);
	      
	   System.out.println("sorted Array ::"+Arrays.toString(array));
	      int result = array[(size-3)];
	      System.out.println("3nd largest element is ::"+result);
	   }
	
	

		String content = "is not like is, but mistakes are common";
		
content = content.replaceAll("\\Wis\\W|^is\\W|\\Wis$", "");
System.out.println(content);
*/
		
		
		
		int[] nums = new int[] { 6, 3, 2, 1, 7, 10, 9 };

        for(int i = nums.length-1; i>=0; i--)
            for(int j = 0; j<i; j++)
            {
                int temp = 0;
                if( nums[j] < nums[j + 1])
                {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                   
                }
               
            }
        
      
	}
	
}