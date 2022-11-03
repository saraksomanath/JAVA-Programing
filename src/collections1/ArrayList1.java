package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      
	      System.out.println(list);
	      //Printing the arraylist object   for loop
	      System.out.println("**************** For loop**********");
	      for (int i = 0; i < list.size(); i++) {
			
	    	  System.out.println(list.get(i));
		}
	      
// print arraylis forEach Loop
	      System.out.println("**************** For EachLoop**********");
	      
	      for (String s : list) {
	    	  System.out.println(s);
		}
	      System.out.println("**************** while iterator **********");
	      
	      Iterator itr=list.iterator();
	      
	      while(itr.hasNext()) {
	    	  
	    	  System.out.println(itr.next());
	      }
	      
	      System.out.println("****************************************************************************");
	      
	      
	      System.out.println("*******************.........collection sort.......**************************");
	      
	     Collections.sort(list);
	    
		}
	      
	}


