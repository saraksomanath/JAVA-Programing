package Array;

public class Min_method {

	public void min(int arr[]) {

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];

			} 

		}
		System.out.println("min:" + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Min_method m = new Min_method();

		int a[] = { 2, 4, 4, 8, 3, 1, };
		m.min(a);

	}

}
