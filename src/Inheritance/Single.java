package Inheritance;

class ClassA {
	int a = 10;
	final int b = 20;
	static int c = 30;
	
	private int p=10;

	void m1() {
		int d = 40;
	}

	static void m2() {
		int e = 50;
	}
}

class ClassB extends ClassA {

	void get() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//System.out.println(e);  // local variable can not
	//	System.out.println(d);  //
		
	//	System.out.println(p); // private
	}
}

public class Single {
	public static void main(String[] arg) {

		ClassA a = new ClassB();
		
		
		
		

	}
}