package collections;

import java.util.HashMap;
import java.util.Map;

class Book{
	
	int id;
	String name ,author,publisher;
	int quntity;
	public Book(int id, String name, String author, String publisher, int quntity) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quntity = quntity;
	}
	
}

public class Hashmap_example {

	public static void main(String[] args) {
		
		
		Book b1=new Book(101,"n1","a1","p1",100);
		Book b2=new Book(102,"n2","a2","p2",200);
		Book b3=new Book(103,"n3","a3","p3",300);
 HashMap <Integer,Book> map=new HashMap <Integer,Book>();
 
 map.put(1, b1);
 
 map.put(2, b2);
 
 map.put(3, b3);
 
for(Map.Entry<Integer,Book> m:map.entrySet()) {
	
	int key=m.getKey();
	
	Book b=m.getValue();
	
	 System.out.println(key+" Details:");  
     System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quntity);   
}
 
	}

}
