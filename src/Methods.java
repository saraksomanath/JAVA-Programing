
public class Methods {

	int a=15;
	int b=5;
	int c;
	// not returning value not argument accepting
	public void  add() {

		c=a+b;
		System.out.println("add: "+c);
	}

//	Returning value not accepting argument
	public  int sub() {
		c=a-b;
		return c;
	}
// return value accepting argument
	public int mult(int i, int j) {
		int k;
		k=i+j;
		return k;

	}
//not return accepting argument
	public void div(int i, int j) {

		int k;
		k=i+j;
		System.out.println("div: "+ k);
	}

	public static void main(String[] args) {


		Methods m1=new Methods();
		
		int substraction ,multiplication;
		m1.add();
		substraction=	m1.sub();
		System.out.println("sub: "+substraction);
		
		multiplication=	m1.mult(7, 3);
	System.out.println("multi:"+multiplication);
		
		m1.div(10, 2);

	}

}
