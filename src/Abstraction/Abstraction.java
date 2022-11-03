package Abstraction;

// a process of hiding the implementation details and showing only functionality to the user.

abstract class Animal{
	
	abstract void eat();
}

class Cat extends Animal{
	public  void eat() {
		System.out.println("eating od abstraction............");
		
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
		
	//	Animal a=new Animal(); can not creat object
		Cat c=new Cat();
		c.eat();

	}

}
