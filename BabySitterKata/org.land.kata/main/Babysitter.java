package main;

public class Babysitter {


	private static final int MIDNIGHT = 12;

	public static int calculateBabysitterPay(int arrival, int departure, int bedtime) {
		int totalPay = 0;	
		departure = normalizeAftermidnightTime(departure);
		
		for(int i = arrival; i < departure; i++ ) {
			
			totalPay = calculatesHerdPay(bedtime, totalPay, i);
			totalPay = calculateLostSleepPay(bedtime, totalPay, i);
			
			}
			return totalPay;
	}

	private static int normalizeAftermidnightTime(int departure) {
		if (departure <= 4) {
			departure += 12;
		}
		return departure;
	}

	private static int calculateLostSleepPay(int bedtime, int totalPay, int i) {
		if(i >= MIDNIGHT) {
			totalPay += 8;
		} else
			totalPay = calculateHouseSittingPay(bedtime, totalPay, i); 
		return totalPay;
	}

	private static int calculateHouseSittingPay(int bedtime, int totalPay, int i) {
		if (i >= bedtime) {
			totalPay += 6;
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
