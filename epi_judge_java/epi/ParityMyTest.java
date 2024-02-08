package epi;
import epi.test_framework.EpiTest;

public class ParityMyTest {
    @EpiTest(testDataFile = "parity.tsv")
    public static short parity(long x) {
        short result = 0;
        short i = 1;
        while (x != 0) {
            System.out.println("pass: " + i++);
            System.out.println("-----------------------");
            System.out.println("x: " + x + ", result: " + result);
            System.out.println("(x & 1): " + (x & 1));
            System.out.println("result: " + (result ^ (x & 1)));
            result ^= (x & 1);
            x >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        parity(11);
//    System.exit(
//        GenericTest
//            .runFromAnnotations(args, "Parity.java",
//                                new Object() {}.getClass().getEnclosingClass())
//            .ordinal());
    }
}
