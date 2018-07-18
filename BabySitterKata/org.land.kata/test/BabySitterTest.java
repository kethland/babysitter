package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.Babysitter;

public class BabySitterTest {
	
	@Test
	public void willCalculateOneHoursHerdPay() {
		int actual = Babysitter.calculateBabysitterPay(5, 6, 7);
		
		assertEquals(6, actual);
	}
	
	@Test
	public void willCalculateTwoHoursHerdPay() {
		int actual = Babysitter.calculateBabysitterPay(5, 7, 8);
		
		assertEquals(12, actual);
	}
}
