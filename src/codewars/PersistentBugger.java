package codewars;

import java.util.Scanner;

/**
 * The problem link: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
 */

public class PersistentBugger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long value = sc.nextLong();
        System.out.println(persistence(value));
    }

    private static int persistence(long n) {
        long temp = 1;
        if (n < 10) return 0;
        while (n != 0) {
            temp *= n % 10;
            n /= 10;
        }
        return persistence(temp) + 1;
    }
}
