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
	public void calculatesOneHourOfSleeplessPay() {
		int actual = Babysitter.calculateBabysitterPay(12, 1, 6);
		
		assertEquals(8, actual);
	}
	
	@Test
	public void calculatesMultipleHoursOfSleeplessPay() {
		int actual = Babysitter.calculateBabysitterPay(12, 4, 6);
		
		assertEquals(32, actual);
	} 
	
	@Test
	public void calculatesFiveHoursHerdAndTwoHouseSittingPay() {
		int actual = Babysitter.calculateBabysitterPay(5, 12, 10);
		
		assertEquals(62, actual);
	}
	
	@Test
	public void babysitterStoryTest() {
		int actual = Babysitter.calculateBabysitterPay(5, 4, 10);
		
		assertEquals(94, actual);
	}
}
