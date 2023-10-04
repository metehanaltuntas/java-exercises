package codewars;

import java.util.Arrays;

/**
 * The problem link: https://www.codewars.com/kata/57f7796697d62fc93d0001b8
 */

public class DoubleTrouble {
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5};
        int t = 3;
        int[] result = trouble(x, t);
        System.out.println(Arrays.toString(result));
    }

    public static int[] trouble(int[] x, int t) {
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] + x[i + 1] == t) {
                int[] temp = new int[x.length - 1];
                System.arraycopy(x, 0, temp, 0, i + 1);
                System.arraycopy(x, i + 2, temp, i + 1, x.length - i - 2);
                x = temp;
                i--;
            }
        }
        return x;
    }
}
