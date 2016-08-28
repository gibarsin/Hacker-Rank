package mathematics.handshake;

import java.util.Scanner;

/**
 * Created by gonzalo on 8/27/16.
 */
public class Solution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int testCases = scanner.nextInt();

        for(int i=0; i < testCases; i++) {
            final int N = scanner.nextInt();

            System.out.println( N*(N-1) / 2 );
        }
    }
}
