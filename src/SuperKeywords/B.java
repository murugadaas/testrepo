package SuperKeywords;

public class B extends A {

	public B() {
		super();	
		System.out.println("childclass");
	}

	public B(int i) {

		super(i);
		System.out.println("childclass");
	}

	
	public B(String name, int age) {

		super(name,age);
		System.out.println("childclass");
	}
	public static final void main(String[] args) {

		B obj = new B();
		B obj1 = new B(22);
		B obj2 = new B("ocean",13);
	}

}
