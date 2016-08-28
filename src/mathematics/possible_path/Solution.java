package mathematics.possible_path;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by gonzalo on 8/27/16.
 */
public class Solution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int testCases = scanner.nextInt();

        for(int i=0; i < testCases; i++) {
            final BigInteger a = scanner.nextBigInteger();
            final BigInteger b = scanner.nextBigInteger();
            final BigInteger x = scanner.nextBigInteger();
            final BigInteger y = scanner.nextBigInteger();

            final BigInteger gcd = a.gcd(b);
            final BigInteger gcd2 = x.gcd(y);

            if(gcd.equals(gcd2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
