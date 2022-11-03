package Inheritance;

// single type inheritance person class student class  data members
class Student {
	String name = "somanath";
	int age = 30;

	public void subject() {

		String mechanical = "design";

		System.out.println(mechanical);
	}

}

public class Person extends Student {

	
	
	public static void main(String[] args) {
		
		Person p1 =new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.subject();
		

	}

}
