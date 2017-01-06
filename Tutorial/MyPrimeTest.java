import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyPrimeTest {

	@Test
	public void isPrimeShouldReturnTrueForPrimes() {
		System.out.println("MyPrimeTest for primes");
		//Special case: only even prime number
		assertEquals("2 is a prime", true, MyPrime.isPrime(2));
		assertEquals("3 is a prime", true, MyPrime.isPrime(3));
		assertEquals("7 is a prime", true, MyPrime.isPrime(7));
		assertEquals("11 is a prime", true, MyPrime.isPrime(11));
	}

	@Test
	public void isPrimeShouldReturnFalseForNonPrimes() {
		System.out.println("MyPrimeTest for non-primes");
		assertEquals("0 is not a prime", false, MyPrime.isPrime(0));
		assertEquals("8 is not a prime", false, MyPrime.isPrime(8));
		assertEquals("4 is not a prime", false, MyPrime.isPrime(4));
		assertEquals("25 is not a prime", false, MyPrime.isPrime(25));
		assertEquals("27 is not a prime", false, MyPrime.isPrime(27));
	}

	@Test(expected = IllegalArgumentException.class) 
	public void primesShouldThrowExceptionFor0() { 
    	MyPrime.primes(0);
	}
}