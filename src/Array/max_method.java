package Array;

public class max_method {



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

		max_method m = new max_method();

		int a[] = { 1, 4, 6, 2, 6, 8 };
		// m.max(a);
		m.min(a);

	}

}
