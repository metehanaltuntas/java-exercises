package hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * The problem link: https://www.hackerrank.com/challenges/java-regex/problem
 */

public class JavaRegex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ip = scanner.next();
            System.out.println(MyRegex.ipAddress(ip));
        }
    }

    static class MyRegex {
        static String regEx = "^(([0-1]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])$";

        static String ipAddress(String s) {
            return Pattern.compile(regEx).matcher(s).find() ? "true" : "false";
        }

    }
}

