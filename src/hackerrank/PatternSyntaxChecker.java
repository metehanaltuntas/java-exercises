package hackerrank;

import java.util.Scanner;

/**
 * The problem link: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 */

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases > 0) {
            String pattern = scanner.nextLine();
            System.out.println(patternSyntaxChecker(pattern));
            testCases--;
        }
    }

    static String patternSyntaxChecker(String s) {
        try {
            java.util.regex.Pattern.compile(s);
            return "Valid";
        } catch (Exception e) {
            return "Invalid";
        }
    }

}
