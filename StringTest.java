package projectSix;

/*
 * Class: CMSC201 
 * Instructor: Grigoriy Grinberg
 * Description: This program uses JUnit to test some methods from the string class.
 * Due: 12/13/21
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Jake Stein
*/


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringTest {

	@Test
	public void lengthTest() {
		String test="test"; //This string should have a length of four
		assertEquals(test.length(),4);
	}
	
	@Test
	  public void charAtTest() {
	    String test2="This is my test string"; //Char at 5 should be an i
	    assertEquals(test2.charAt(5),'i');
	  } 

	  @Test
	  public void substringTest() {
	    String test3="My dog has fleas"; //Substring 3, 6 should equal dog
	    assertEquals(test3.substring(3, 6),"dog");
	  }     
	  
	  @Test
	  public void indexOfTest() {
	    String test4="My dog has fleas"; //indexOf fleas should be 11
	    assertEquals(test4.indexOf("fleas"),11);
	  }   

	  @Before
	  public void setUp() throws Exception {
	    // Common objects used by test methods may be set up here
	  }

}
