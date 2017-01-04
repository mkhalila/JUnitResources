public class MyPrime {

	public static boolean isPrime(long number) {
		if (number < 2) return false;
		if (number == 2) return true;
		if ((number % 2) == 0) return false;

		for (long d = 3; d <= Math.sqrt(number); d += 2) {
			if ((number % d) == 0) return false;
		}

		return true;
	}
}