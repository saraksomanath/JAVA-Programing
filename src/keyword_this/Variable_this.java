package keyword_this;


class A{
	int a;
	
	void m1(int a) {
		
		this.a=a;
	}
	
	void show() {
		
		System.out.println(a);
	}
	
}

public class Variable_this {

	public static void main(String[] args) {


		A ref=new A();
		ref.m1(20);
		
		ref.show();

	}

}
