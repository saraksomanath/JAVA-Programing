package Super;

class Parent1 {

	int a = 10;
	String name = "somanath";

	void m1() {

		System.out.println("parent class with m1 method");
	}

}

class child1 extends Parent1 {

	void display() {

		System.out.println(super.a);

		System.out.println(super.name);
	}

	void show() {
		super.m1();
	}
}

public class Super_method {

	public static void main(String[] args) {
		child1 c = new child1();
		c.display();
		c.show();

	}

}
