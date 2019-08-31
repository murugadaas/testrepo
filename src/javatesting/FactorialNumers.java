package javatesting;

public class FactorialNumers {
	
	// static int Factorial(int num) {
	/*	int fact = 1;
		if (num ==0)
			return 1;
		for (int i=1; i<=num ; i++) {
			fact = fact*i;			
		}
		return fact;
	}
	
	
	*/
	
	// using recursion
	public static int fact(int num) {
		if (num ==1)
			return 1;
		else
			return(num * fact(num-1));
	}
	
	
	public static void main(String[] args) {

	//System.out.println("The facroial of number is :"+Factorial(4));
	System.out.println(fact(0));
	
	}
}