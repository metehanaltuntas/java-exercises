package leetcode;

import java.util.Scanner;

/**
 * The problem link: https://leetcode.com/problems/sum-of-two-integers/
 */

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(getSum(a, b));
    }

    static int getSum(int a, int b) {
        int temp = 0;
        while (b != 0) {
            temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}
