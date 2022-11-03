package String;

class Strings {
	int roll_no;
	String name;
	int age;

	public Strings(int roll_no, String name, int age) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println(roll_no + " " + name + " " + age);
	}
	
	// OR
	
	public String toString() {
		
		return roll_no + " " + name + " " + age;
	}
	
	
}

public class ToString {

	public static void main(String[] args) {

		Strings s1 = new Strings(101, "somanath", 30);
		s1.display();

		System.out.println(s1);
		
		Strings s2 = new Strings(102, "aishu", 23);
		
		System.out.println(s2);
	}

}
