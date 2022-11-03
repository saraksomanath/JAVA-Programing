package String;

public class String_method {

	public static void main(String[] args) {

		
//Returns the char value at thespecified index. An index ranges from 0 to length() - 1
		String s1="java Autumation";
		System.out.println("charAt: "+s1.charAt(0));
		
		
		// Compares two strings lexicographically.
		//The comparison is based on the Unicode value of each character inthe strings.
		String s2="Automation";
		String s3="automation";
		System.out.println("compareTo: "+s2.compareTo(s3));  // A-97 a-64  Unicode value diff
		
		
		//Compares two strings lexicographically, ignoring casedifferences
		String s4="JAVA Autumation";
		System.out.println("compareToIgnoreCase:"+s4.compareToIgnoreCase(s1));
		
		//Concatenates the specified string to the end of this string
		String s5=" this is java programm";
		System.out.println(s1.concat(s5));
		
		//Returns true if and only if this string contains the specifiedsequence of char values
		String s6="this is java programm a part of automation";
		System.out.println("string contains: "+s6.contains("java"));
		
		System.out.println("string contains: "+s6.contains(s3));
		
		
		
		//Compares this String to another String, ignoring caseconsiderations.
		//same sequence of characters as thisobject
		System.out.println("equals: "+s2.equals(s3));
		System.out.println("equalsIgnoreCases: "+s2.equalsIgnoreCase(s3));
		
		//Returns the length of this string
		String s7="This is java programming";
		System.out.println("ength of this string: "+s7.length());
		
		//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar
		String s8="This is java programming";
		System.out.println("replace chars :"+s8.replace('T', 't'));
		
		String s9="This is JAVA programming 1234!@#$%^&";
		System.out.println("replaceALL MEthod: "+s9.replaceAll(" ", ""));
		System.out.println("replaceALL MEthod: "+s9.replaceAll(" is", " have"));
		System.out.println("replaceALL MEthod  [a-z]: "+s9.replaceAll("[a-z]", ""));
		System.out.println("replaceALL MEthod[a-zA-Z]: "+s9.replaceAll("[a-zA-Z]", ""));
		System.out.println("replaceALL MEthod[a-zA-Z ]: "+s9.replaceAll("[a-zA-Z ]", ""));
		System.out.println("replaceALL MEthod[a-zA-Z ]: "+s9.replaceAll("[a-zA-Z0-9 ]", ""));
		System.out.println("replaceALL MEthod[a-zA-Z ]: "+s9.replaceAll("[a-zA-Z0-9 ]", ""));
		
		
		
		String s10="Hi Welcome to java Autumation";
		
		System.out.println("replaceALL MEthod count vowels : "+s10.replaceAll("[^'a','e','o','i','u']", "").length());
		
		//int value  from String
		
		String a=s9.replaceAll("[^0-9]", "");
		System.out.println(a);
		//int l=a+20;
		System.out.println(a);// Not adding => a is String
		
		int i=Integer.parseInt(a);
		System.out.println("int value: "+i);
		
		int k=i+16;
		System.out.println("int value: "+k);
		
		
		//Splits this string around matches of the given regular expression
		String s11= "this is java automation program and java is reuired for automation testing";
		System.out.println(s1.split(" "));
		String s12 [] =s11.split(" ");
		for (String s:s12) {
			System.out.println(s);
		}
		
		
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
	}

}
