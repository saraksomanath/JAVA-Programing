package Inheritance;

class Parent1 {
 int a=10 ;
	static int b=20;
	final int c = 30;
	protected int  d=40;
	
	public Parent1(int a, int d) {
		
		this.a = a;
		this.d = d;
	}
	
	public void disply() {
		
		System.out.println(this.a +" "+   this.b +" "+  this.c +" "+ this.d);
	}
	public static void show() {
		System.out.println("parent class show method");
	}
}

class Child1 extends Parent1 {

	public Child1(int a, int d) {
		super(a, d);
		// TODO Auto-generated constructor stub
	}
	public void Parent1(int a, int d) {
		
		
	}
public void disply() {
		
		System.out.println(super.a +" "+   super.b +" "+ super.c +" "+" "+ this.d);
		
		System.out.println("additiom"+100+100);
		System.out.println(100+100+" addition");
	}
public static  void show() {
	System.out.println("child class show method");
}
}

public class Inheritance_parent {

	public static void main(String[] args) {

		// Parent1 p = new Parent1();
		Child1 c = new Child1(11, 22);
		c.disply();
		c.show();
	
	}

}
