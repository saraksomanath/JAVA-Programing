package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList1 {

	public static void main(String[] args) {
		LinkedList<String> s1 = new LinkedList<String>();

		s1.add("white");
		s1.add("red");
		s1.add("black");

		// System.out.println(s1); //==>[white, red, black]

		System.out.println("===========while and iterator====================================");
		Iterator itr = s1.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		System.out.println("====================for loop================================================ ");

		for (String s : s1) {
			System.out.println(s);
		}

	}
}
