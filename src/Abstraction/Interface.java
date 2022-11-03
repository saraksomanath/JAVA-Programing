package Abstraction;

interface ROI {
	float rate_of_intrest();
}


class SBI implements ROI {
	public float rate_of_intrest() {	
		return 7.6f;
		}
	}


public class Interface {

	public static void main(String[] args) {

		ROI r = new SBI();

		System.out.println("SBI rate of intrest= " + r.rate_of_intrest() + "%");

	}

}
