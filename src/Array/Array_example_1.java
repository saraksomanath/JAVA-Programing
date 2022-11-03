package Array;

import java.util.Iterator;
import java.util.Scanner;


//https://www.includehelp.com/java-programs/move-all-zero-at-the-end-of-the-array.aspx?ref=rp


class Student {

	String name;
	int roll_no;
	int marks;

	Scanner sc = new Scanner(System.in);

	public void getMarks() {

		System.out.print("enter the Roll_no: ");
		 roll_no = sc.nextInt();
		 System.out.print("enter the name: ");
		name = sc.next();
		System.out.print("enter the, marks: ");
		 marks = sc.nextInt();
	}

	public void disply() {

		System.out.println(roll_no+" " + name +" " + marks);
	}
}

public class Array_example_1 {

	public static void main(String[] args) {

		Student[] obj;
		obj = new Student[5];
		for (int i = 0; i < 5; i++) {

			obj[i] = new Student();

		}

		for (int i = 0; i < 5; i++) {

			obj[i].getMarks();
			obj[i].disply();
		}
		
	
	}

}
