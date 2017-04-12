package com.fundingCircle;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.TestCase;

/**
 * Unit test for Prime Multiplication Test.
 */
public class PrimeMultiplicationTest extends TestCase {

	PrimeMultiplication p = new PrimeMultiplication();
	/**
	 * Checking the functionality of the isPrime function for the edge cases
	 */
	@Rule
	public final ExpectedException e = ExpectedException.none();

	// @Test(expected = InputMismatchException.class)
	@Test
	public void testInputMismatchException() {

		try {
			p.isPrime(0);
		} catch (Exception e) {
			assertThat(e.getMessage(), is("Please enter an integer between 1 and " + Integer.MAX_VALUE));
		}
	}

	@Test
	public void testOne() {
		assertEquals(p.isPrime(1), true);
	}

	@Test
	public void testIntMax() {
		assertEquals(p.isPrime(Integer.MAX_VALUE), false);
	}

	// @Test(expected = InputMismatchException.class)
	@Test
	public void testIntMin() {

		try {
			p.isPrime(Integer.MAX_VALUE);
		} catch (Exception e) {
			assertThat(e.getMessage(), is("Please enter an integer between 1 and " + Integer.MAX_VALUE));
		}
	}

	
}
