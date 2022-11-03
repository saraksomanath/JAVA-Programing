package Exception;

public class E1 {

	public static void main(String[] args) {

		try {
			int a = 3, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {

			e.printStackTrace();  //this gives exception description tStackTrace()
		
	//System.out.println(e.toString()); //this gives exception description
		
	//	System.out.println(e.getMessage()); //this gives description
			
			
		}

		System.out.println("****************try and catch block executed****************** ");
	}

}
