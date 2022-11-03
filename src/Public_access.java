class employee{
	
	int eno=101; /// default access modifier
	
	public String name="somanath";  // public access modifier
	
	
}


public class Public_access {


	public static void main(String[] args) {
		
		employee e1=new employee();
		
		System.out.println(e1.eno);
		
		System.out.println(e1.name);

	}

}
