package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<String> listOfString = Arrays.asList("Java", "C", "C++", "Go", "JavaScript", "Python", "Scala");

		// Example 1 - converting Stream to List using collect() method


		List<String> listOfStringstartwithJ =listOfString.stream().filter(s->s.startsWith("J")).collect(Collectors.toList());
		
		System.out.println(listOfStringstartwithJ);
		
		Set<String> setofStringstartwithC=listOfString.stream().filter(s->s.startsWith("C")).collect(Collectors.toSet());
		
		System.out.println(setofStringstartwithC);
		
		// Example 2 - converting Stream to Set


		
}
}