package collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {

	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {

		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

}

public class ArrayList2 {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		
		List<Student> list=new ArrayList();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator<Student> itr=list.iterator();
		
		while (itr.hasNext()) {
			
			
			Student s=(Student) itr.next();
			
			System.out.println(s.rollno+ " " + s.name+" " +s.age);
		
			
		}
		
		System.out.println("****************************************");
		
		
		for (Student student : list) {
			
			
			System.out.println(student.rollno+ " "+ student.name+" "+student.age);
		}
	}

}
