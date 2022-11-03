class Static_1{
	
	int a=10;
	static int b=100;
	
	public static void disply() {
		
		System.out.println(b);
	}
}
public class Static_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static_1 v=new Static_1();
		Static_1 v1=new Static_1();
		System.out.println(v.a);
		System.out.println(v.b);
		v.disply();
		
		//two memory ref to non static
		v.a=2;
		System.out.println(v.a);
		System.out.println(v1.a);
		
		
		// only one memory ref to static var
		v.b=200;
		System.out.println(v1.b);
	}

}
