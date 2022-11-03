
public class Calculators {
	
	int a=5;
	int b=3;
	int c;
	
	public void add() {
		System.out.println("addition of a and b: "+ (a+b));
	}

	public void sub() {
		System.out.println("substraction of a and b; "+ (a-b));
	}
	
	public void multiply() {
		System.out.println("addition of a and b: "+ (a*b));
	}

	public void div() {
		System.out.println("div of a and b : "+ (a/b));
	}
	public static void main(String[] args) {

		Calculators cal=new Calculators();
		
		cal.add();
		cal.sub();
		cal.multiply();
		cal.div();

	}

}
