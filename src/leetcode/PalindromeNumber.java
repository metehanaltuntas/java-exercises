package leetcode;

import java.util.Scanner;

/**
 * The problem link: https://leetcode.com/problems/palindrome-number/
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x != 0) {
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }
        return original == reversed;
    }
}
