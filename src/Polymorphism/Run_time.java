package Polymorphism;

class Person{
	
	public void write() {
		System.out.println("i am person class");
	}
}

class Student extends Person{
	
	public void write() {
		System.out.println("i am student class");
	}
}

public class Run_time {

	public static void main(String[] args) {
		
		Person s;
		s=new Student();
		s.write();
		
		 s= new Person();
		 s.write();
	}

}
