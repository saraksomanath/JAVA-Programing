package Super;

class Parent{
	
	int a=10;
	String name="somanath";
	
}


class child extends Parent{
	
	void display() {
		
		
		System.out.println(super.a);
		
		System.out.println(super.name);
	}
}

public class Super_var {

	public static void main(String[] args) {
	
		child c=new child();
		c.display();
		

	}

}
