package javatesting;

public class Constructor {

	String name;
	int age;

	// act as default constructor
	public Constructor() {
		System.out.println("Default constructor");
	}

// 2ble param constructor
	public Constructor(int age, String name) {
		this.age=age;
		this.name= name;
		System.out.println("double parameter constructoe\r");
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		// it'll call default constructor
		Constructor obj = new Constructor(23, "vinot");

	}

}
