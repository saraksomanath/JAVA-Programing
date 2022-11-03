package collections1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "sps");
		hm.put(2, "piyu");
		hm.put(3, "anvi");
		hm.put(4, "aishu");
		hm.put(5, null);
		
		System.out.println(hm);
		
	for (Map.Entry<Integer,String> map:hm.entrySet()) {
		
		System.out.println("id: "+ map.getKey()+"  name: "+ map.getValue());
		
	}
		
	}

}
