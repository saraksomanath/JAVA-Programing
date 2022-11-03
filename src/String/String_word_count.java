package String;

public class String_word_count {

	public static void main(String[] args) {
		

		String str="Welcome to Javatpoint portal";  
		
		int count=1;
		char chars='a';
		for (int i=0;i<str.length();i++) {
			
			if ((str.charAt(i)==' ')) {
				count++;
			}
		}

		System.out.println(count);

	}

}
