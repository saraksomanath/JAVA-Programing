package String;

public class String_read {

	public static void main(String[] args) {

		char[] chars = { 's', 'o', 'm', 'a', 'n', 'a', 't', 'h' };

		char[] chars1 = { 's','a','r','a','k'};
		String s = new String(chars);  /// char[] array to string

		System.out.println(s);
		
		// char to String
		String s1=String.valueOf(chars1);
		System.out.println(s1);
		
		// using character class
		
	//	String s2=Character.toString();
		
		
		//read string by index
		String str= "anvi";
		for (int i=0;i<str.length();i++) {
		System.out.print(str.charAt(i));}
		
	}


}
