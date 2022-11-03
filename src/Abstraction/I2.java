package Abstraction;


interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class I2 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  





	public static void main(String[] args) {
		I2 obj = new I2();  
		obj.print();  
		obj.show();  

	}

}
