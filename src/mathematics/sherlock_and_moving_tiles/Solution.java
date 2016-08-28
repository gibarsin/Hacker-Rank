package mathematics.sherlock_and_moving_tiles;

import java.util.Scanner;

/**
 * Created by gonzalo on 8/27/16.
 */
public class Solution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final double sqrt2 = Math.sqrt(2);

        final int L = scanner.nextInt();
        final int S1 = scanner.nextInt();
        final int S2 = scanner.nextInt();
        final int Q = scanner.nextInt();

        for(int i=0; i<Q; i++) {
            final int Qi = scanner.nextInt();
            final double time = sqrt2 * (L - Math.sqrt(Qi)) / (Math.abs(S1 - S2));

            System.out.println(time);
        }
    }
}
