package String;

public class String_count {

	public static void main(String[] args) {


		String str="Welcome to Javatpoint portal";  
		
		int count=0;
		char chars='a';
		for (int i=0;i<str.length();i++) {
			
			if (str.charAt(i)==chars) {
				count++;
			}
		}

		System.out.println(count);
	}

}
