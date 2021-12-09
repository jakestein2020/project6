package projectSix;

/**
 * @author example code provided by Java Programming Language
 * This class generates and prints prime numbers as well as testing whether a number is prime
 */
public class PrimeNumberMethod {
	
	/**
	 * @param args
	 * This is the main method. It prints out the first 50 prime numbers.
	 */
	public static void main(String[] args) {
	    System.out.println("The first 50 prime numbers are \n");
	    printPrimeNumbers(50);
	  }

	  /**
	 * @param numberOfPrimes
	 * This loops through all the numbers, tests if they're prime,
	 *  and if so it will print out the number and allows you to set
	 *   the number of primes per line that get printed.
	 */
	public static void printPrimeNumbers(int numberOfPrimes) {
	    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
	    int count = 0; // Count the number of prime numbers
	    int number = 2; // A number to be tested for primeness

	    // Repeatedly find prime numbers
	    while (count < numberOfPrimes) {
	      // Print the prime number and increase the count
	      if (isPrime(number)) {
	        count++; // Increase the count

	        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
	          // Print the number and advance to the new line
	          System.out.printf("%-5s\n", number);
	        }
	        else
	          System.out.printf("%-5s", number);
	      }

	      // Check if the next number is prime
	      number++;
	    }
	  }
	  
	  /**
		 * isPrime determines whether a number is prime.
		 * @return returns a boolean value true if prime false if not
		 */

	  /** Check whether number is prime */
	  public static boolean isPrime(int number) {
	    for (int divisor = 2; divisor <= number / 2; divisor++) {
	      if (number % divisor == 0) { // If true, number is not prime
	        return false; // number is not a prime
	      }
	    }

	    return true; // number is prime
	  }
}
