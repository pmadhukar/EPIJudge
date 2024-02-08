package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class Parity {
  @EpiTest(testDataFile = "parity.tsv")
  public static short parity(long x) {
    short result = 0;
    while (x != 0) {
      result ^= (x & 1);
      x >>>= 1;
    }
    return result;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "Parity.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}

class ParityExplained {
  public static long parity (long x) {
    long result = 0;
    while (x != 0) {
      long lastBit = x & 1; // Get last bit of x.
      result = result ^ lastBit; // Count the number of 1s seen yet. Value will be 0 if number of 1s is even, otherwise 1.
      x = x >>> 1;
    }
    return result;
  }
}
