package Encapsulation;

public class Encapsulation {

	private String name;
	private int age;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {


		Encapsulation e=new Encapsulation();
		
		e.setName("somnath");
		System.out.println(e.getName());
		
		e.setAge(30);
		System.out.println(e.getAge());

	}

}
