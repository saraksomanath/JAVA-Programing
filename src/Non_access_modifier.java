class Person{
final int id=101;
	
static String name="somanath";

static String dept ="test";

int salary=20000;

static void display() {
	String city="pune";
	System.out.println(city);	
}
	
}
public class Non_access_modifier {

	
	
	public static void main(String[] args) {

		Person p1=new Person();
		
		//call data member by object_ref
		System.out.println(p1.id); 
		System.out.println(p1.name);
		System.out.println(p1.dept);
		System.out.println(p1.salary);
		p1.display();
	//	System.out.println(p1.city);
		
		//call data member by class_name
		
	//	System.out.println(Person.id); // can not call var is final so
		System.out.println(Person.name);
		System.out.println(Person.dept);
	//	System.out.println(Person.salary); // can not call default 
		Person.display();  // method is static so we call by 
	}

}
