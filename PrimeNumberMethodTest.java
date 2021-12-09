package projectSix;

import static org.junit.Assert.*;

import org.junit.Test;



public class PrimeNumberMethodTest {
	
	PrimeNumberMethod p=new PrimeNumberMethod();

	
	
	@Test
	public void isPrimeTest() {
		assertEquals(p.isPrime(7),true); //7 should be true
		assertEquals(p.isPrime(22),false); //22 should be false
	}

}
