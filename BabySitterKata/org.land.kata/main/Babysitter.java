package main;

public class Babysitter {


	public static int calculateBabysitterPay(int arrival, int departure, int bedtime) {
		int totalPay = 0;	
		for(int i = arrival; i < departure; i++ ) {
			if (i < bedtime) {
				totalPay += 10;
			}
			if(i >= bedtime) {
				totalPay += 6;
			}
			}
			return totalPay;
	}


}
