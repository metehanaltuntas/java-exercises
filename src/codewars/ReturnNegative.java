package codewars;

/**
 * The problem link: https://www.codewars.com/kata/55685cd7ad70877c23000102
 */

public class ReturnNegative {
    public static void main(String[] args) {
        System.out.println(makeNegative(42));
    }

    public static int makeNegative(final int x) {
        return x < 0 ? x : -x;
    }
}
