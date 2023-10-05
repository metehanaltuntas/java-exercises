package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The problem link: https://leetcode.com/problems/generate-parentheses/
 */

public class GenerateParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> parentheses = new ArrayList<>();
        backtrack(parentheses, new StringBuilder(), 0, 0, n);
        return parentheses;
    }

    public static void backtrack(List<String> parentheses, StringBuilder current, int open, int close, int max) {
        if (current.length() == max * 2) {
            parentheses.add(current.toString());
            return;
        }

        if (open < max) {
            current.append("(");
            backtrack(parentheses, current, open + 1, close, max);
            current.deleteCharAt(current.length() - 1);
        }
        if (close < open) {
            current.append(")");
            backtrack(parentheses, current, open, close + 1, max);
            current.deleteCharAt(current.length() - 1);
        }

    }

}
