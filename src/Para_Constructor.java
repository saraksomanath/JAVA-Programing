
public class Para_Constructor {

	int a;
	String s;
	float f;

	public Para_Constructor(int i, String str, float ft) {

		a = i;
		s = str;
		f = ft;
	}

	public Para_Constructor() {

		a = 10;
		s = "spsps";
		f = 28.3f;
	}

	public Para_Constructor(int i, String str) {

		a = i;
		s = str;
	
	}
	public void display() {
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(f);
	}
	public static void main(String[] args) {
		
		Para_Constructor pc1=new Para_Constructor();
		pc1.display();
		
		Para_Constructor pc2=new Para_Constructor(20,"para_pass through object",22.2f);
		pc2.display();
		
		Para_Constructor pc3=new Para_Constructor(30, "soma");
		pc3.display();
	}

}
