package collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
	
		HashMap <Integer,String> h1=new HashMap <Integer,String>();
		
		h1.put(1, "monday");
		h1.put(2, "tuesday");
		h1.put(3, "wensday");
		
	//	System.out.println(h1);  // ==>{1=monday, 2=tuesday, 3=wensday}
		
		for(Map.Entry m:   h1.entrySet()) {
			
		
			System.out.println(m.getValue());
		}

	}

}
