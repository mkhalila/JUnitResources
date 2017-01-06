import static org.junit.Assert.fail;

public class MyPrime {
  public static boolean isPrime(long number) {
    if (number<=1) return false;
    if (number<=3) return true;
    if (number%2==0) return false;
    if (number%3==0) return false;
    int i = 4;
    for(long d=5; d<=Math.sqrt(number); d+=i) {
      if (number%d==0) return false;
      i = 6 - i;
    }
    return true;
  }

  public static long[] primes(int primeCount) throws IllegalArgumentException {
    if (primeCount < 1) throw new IllegalArgumentException("MyPrime.primes must be called with primeCount >=1");
    return new long[1];
  }
}
