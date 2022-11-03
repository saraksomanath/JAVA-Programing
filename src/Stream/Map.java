package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {

	int Eno;
	String name;
	int salary;

	public Person(int eno, String name, int salary) {

		this.Eno = eno;
		this.name = name;
		this.salary = salary;
	}

}

public class Map {

	public static void main(String[] args) {

		ArrayList<Person> list1 = new ArrayList<Person>();

		list1.add(new Person(101, "somanath", 3000));
		list1.add(new Person(104, "anvi", 6000));
		list1.add(new Person(105, "aishu", 9000));
		list1.add(new Person(107, "piyu", 2000));

		/*
		 * List<Integer> list1 = list.stream().filter(s -> s.salary > 5000).map(s ->
		 * s.salary) .collect(Collectors.toList()); System.out.println(list1);
		 */

		/*
		 * list1.stream().filter(s->s.salary == 2000) .forEach(s->
		 * System.out.println(s.name));
		 */

	
	}

}
