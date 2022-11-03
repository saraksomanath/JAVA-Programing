package Exception;



public class Finally {

	public static void main(String[] args) {


		try
		{
			int a=30,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("i am in finally block .i am executed  ");
		}
		
		System.out.println("hello.........");
	}

}
