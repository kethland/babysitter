package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.Babysitter;

public class BabySitterTest {
	
	@Test
	public void willCalculateOneHoursHerdPay() {
		int actual = Babysitter.calculateBabysitterPay(5, 6, 7);
		
		assertEquals(10, actual);
	}
	
	@Test
	public void willCalculateTwoHoursHerdPay() {
		int actual = Babysitter.calculateBabysitterPay(5, 7, 8);
		
		assertEquals(20, actual);
	}
	
	@Test
	public void calculatesHouseSittingPay() {
		int actual = Babysitter.calculateBabysitterPay(5, 7, 6);
		
		assertEquals(16, actual);
	}
	
	@Test
	public void calculatesOneHourOfAfterMidnightPay() {
		int actual = Babysitter.calculateBabysitterPay(12, 1, 6);
		
		assertEquals(8, actual);
	}
}
