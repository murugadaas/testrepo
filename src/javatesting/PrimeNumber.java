package javatesting;

public class PrimeNumber {

	
	public static boolean inPrimeNumber(int num) {
		if (num <=1) {
			
			return false;
		}
		
		for (int i=2;i<num;i++) {
			if(num % i ==0 ) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void getPrimenumber(int num) {
		
		for (int i=2;i<num;i++) {
			if(inPrimeNumber(i))
				System.out.println(i+" ");
	}
	
	}
	
	
	
	
	public static void main(String[] args) {
	
		System.out.println("is 10 is a prime number:"+inPrimeNumber(10));
		getPrimenumber(20);
	}

}
