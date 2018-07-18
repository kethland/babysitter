package main;

public class Babysitter {


	public static int calculateBabysitterPay(int arrival, int departure, int bedtime) {
		int totalPay = 0;	
		for(int i = arrival; i < departure; i++ ) {
			totalPay = calculatesHerdPay(bedtime, totalPay, i);
			if(i >= bedtime) {
				totalPay += 6;
			}
			}
			return totalPay;
	}

	private static int calculatesHerdPay(int bedtime, int totalPay, int i) {
		if (i < bedtime) {
			totalPay += 10;
		}
		return totalPay;
	}


}
