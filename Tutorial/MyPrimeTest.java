import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyPrimeTest {

	@Test
	public void isPrimeShouldReturnTrueForPrimes() {
		assertEquals("3 is a prime", true, MyPrime.isPrime(3));
		//Special case: only even prime number
		assertEquals("2 is a prime", true, MyPrime.isPrime(2));
		assertEquals("13 is a prime", true, MyPrime.isPrime(13));
	}

	@Test
	public void isPrimeShouldReturnFalseForNonPrimes() {
		assertEquals("4 is not a prime", false, MyPrime.isPrime(4));
		assertEquals("0 is not a prime", false, MyPrime.isPrime(0));
		assertEquals("6 is not a prime", false, MyPrime.isPrime(6));
	}
}