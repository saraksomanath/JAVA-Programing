package Inheritance;

class Parent_class {

	public static void show() {
		System.out.println("parent class show method");
	}
}

class Child2 extends Parent_class {

	public static void show() {
		System.out.println("child class show method");
	}
}

public class Static_Method_inheritance {

	public static void main(String[] args) {

		Child2 c=new Child2();
		
		c.show();
	}

}
