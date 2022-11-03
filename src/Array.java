import java.util.Arrays;

public class Array {

	public static void main(String[] args) {


		int [] number= { 2,9,4,7,3,7,6};
		
		Arrays.sort(number);
		
		for (int i=0;i<number.length;i++) {
			
			
			if (number[i]==number[i+1])
				
				System.out.println(number);
		}

	}

}
