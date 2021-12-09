package projectSix;

/*
 * Class: CMSC201 
 * Instructor: Grigoriy Grinberg
 * Description: This program tests the isPrime method in PrimeNumberMethod.java
 * Due: 12/13/21
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Jake Stein
*/


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
