package Inheritance;

class Animal{
	
	public void eat() {
		
		System.out.println("eating grasss.....");
	}
}

class Cat extends Animal{
	
	public void walk() {
		
		System.out.println("meooo .........");
	}
}

class Dog extends Animal{
	
	public void sound() {
		
		System.out.println("bhuoooooo");
	}
}
public class Heirarchy {

	public static void main(String[] args) {


		Cat c =new Cat();
		
		Dog d=new Dog();
		
		c.eat();
		d.eat();
		
		c.walk();
		d.sound();
		

	}

}
