package String;

import java.util.HashMap;

public class No_words {

	public static void main(String[] args) {

		String s="this is my name and this is my house";
		
		HashMap <String ,Integer> map=new HashMap <String ,Integer>();
		String [] split_w=s.split(" ");

		for(int i=0;i<split_w.length;i++) {
			System.out.println(split_w);
		}
	}

}
