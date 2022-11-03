package Polymorphism;

public class Compile_time {
	
	int a,b,c;
	double x,y,z;
	public void add(int a, int b) {
		
		c=a+b;
		System.out.println(c);	
	}

	public void add(double x, double y ) {
		
		z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
	
		Compile_time c=new Compile_time();
		
		c.add(10, 20);
		
		c.add(1.11, 2.22);

	}

}
