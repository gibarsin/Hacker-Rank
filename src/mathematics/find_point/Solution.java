package mathematics.find_point;

import java.util.Scanner;

/**
 * Created by gonzalo on 8/27/16.
 */
public class Solution {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int testCases = scanner.nextInt();

        for(int i=0; i<testCases; i++) {
            final int Px = scanner.nextInt();
            final int Py = scanner.nextInt();
            final int Qx = scanner.nextInt();
            final int Qy = scanner.nextInt();

            final int projX = 2 * Qx - Px;
            final int projY = 2 * Qy - Py;

            System.out.println(projX + " " + projY);
        }
    }
}
