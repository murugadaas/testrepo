package javatesting;

public class StaticAndNonStatic {

	// declaring global variables
	String name = "demoa";
	static int age = 22;

	public static void main(String[] args) {
		// calling sum methods & varables by 2 ways
		sum(); // or
		StaticAndNonStatic.sum();

		// calling staticc variables by 2 ways

		System.out.println(age+"gggu"); // oR

		System.out.println(StaticAndNonStatic.age+ 10);

		// calling non staticc variables'
		// create new object

		StaticAndNonStatic obj = new StaticAndNonStatic();

		obj.mymail();
		System.out.println(obj.name);

		// calling non staticc method by object reference
		obj.sum();
	}

	// method 1
	public static void sum() {
		System.out.println("sum metod");

	}

	// method 2
	public void mymail() {
		System.out.println("send mail method");
	}

}
