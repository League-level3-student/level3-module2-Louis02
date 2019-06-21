package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class _00_MoreAndMoreTests {

	 @Test
	 public void MultTest() {
	
	 assertEquals("10 x 0 = 0", multiply(10, 0));
	 assertEquals("10 x 10 = 100", multiply(10, 10));
	 assertEquals("8 x 11 = 88", multiply(8, 11));
	 }

	
	 @Test
	 public void PrimeTest() {
	
	 assertTrue(isPrime(3));
	 assertTrue(isPrime(5));
	 assertTrue(isPrime(541));
	 assertFalse(isPrime(4));
	 assertFalse(isPrime(12));
	 assertFalse(isPrime(527));
	
	 }
	
	 @Test
	 public void SquareTest() {
	
	 assertTrue(isSquare(4));
	 assertTrue(isSquare(144));
	 assertTrue(isSquare(64));
	 assertTrue(isSquare(10201));
	 assertTrue(isSquare(1));
	 assertFalse(isSquare(3));
	 assertFalse(isSquare(22));
	 assertFalse(isSquare(143));
	
	 }

	private boolean isSquare(int p) {
		boolean ans = false;
		for (int i = 0; i < p; i++) {

			if (i * i == p || p == 1) {
				ans = true;

			}

		}

		return ans;
	}

	@Test
	public void CubeTest() {

		assertTrue(isCube(27));
		assertTrue(isCube(216));
		assertTrue(isCube(729));
		assertTrue(isCube(1));
		assertFalse(isCube(3));
		assertFalse(isCube(22));
		assertFalse(isCube(143));

	}

	private boolean isCube(int p) {
		// TODO Auto-generated method stub
		boolean ans = false;
		for (int i = 0; i < p; i++) {
			if (i * i * i == p || p == 1) {
				ans = true;
			}

		}
		return ans;
	}

	private boolean isPrime(int i) {
		// TODO Auto-generated method stub
		boolean ans = true;
		for (int k = 2; k < i; k++) {
		 if (i%k==0) {
				ans = false;
			}
		 
		}
		return ans;
	}

	private Object multiply(int i, int j) {
		// TODO Auto-generated method stub
		String ans = i + " x " + j + " = " + i * j;
		return ans;
	}

}
