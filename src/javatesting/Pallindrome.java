package javatesting;

public class Pallindrome {

	
	public static void isPallindrome(int num) {
		
		int r=0;
		int sum=0;
		int t;
		t=num;
	
	while (num >0) {
		
		 r = num%10;
		 sum =(sum*10)+r;
		 num =num/10;
		
	}
	
	if(t==sum) {
		System.out.println("num is pallindrome");
	}else {
		System.out.println("num is not pallindrome");
	}
	}
	
	
	
	public static void main(String[] args) {
		isPallindrome(151);

	}

}
