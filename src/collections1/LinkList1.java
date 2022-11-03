package collections1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkList1 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Anuj");
		ll.add("Gaurav");
		ll.add("Gaurav");

		for (String string : ll) {
			System.out.println(string);
		}
        // sort array
		Collections.sort(ll);
		System.out.println(ll);

		// remove duplicate

		Set<String> s = new LinkedHashSet<String>(ll);

		System.out.println(s);
	}

}
