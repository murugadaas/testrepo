package javatesting;

import javax.management.RuntimeErrorException;

public class FinallyConcepts {

	public static final void main(String[] args) {
		test1();

	}

	public static void test1() {
		int i = 10;
		try {
			System.out.println("inside test1 methpd");
			int k = i / 0;
		} catch (NullPointerException e) {
			System.out.println("insode catch block");

		} finally {
			System.out.println("finally excuted");
		}
	}
}
