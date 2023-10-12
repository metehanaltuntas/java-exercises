package hackerrank;

import java.util.Scanner;

/**
 * The problem link: https://www.hackerrank.com/challenges/java-string-reverse/problem
 */

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();

        System.out.print(isPalindrome(A));
    }

    private static String isPalindrome(String s) {
        if (s.length() == 1) {
            return "Yes";
        }
        s = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                return "No";
            }
            if (i != s.length() / 2)
                s = s.substring(i + 1, s.length() - 1);
        }
        return "Yes";
    }
}
