package Inheritance;

class Vehicle {

	public void sound() {

		System.out.println("vehicle.......peeeeeee");
	}

}

class Car extends Vehicle{
		
		public void wheel() {
			
			System.out.println("car........wheel");
		}

	}
class Tata extends Car{
	
	public void brand() {
		
		System.out.println("tata brand...........");
	}
}
public class Multi_level {

	public static void main(String[] args) {

		Tata t1=new Tata();
		
		t1.sound();
		t1.wheel();
		t1.brand();

	}

}
