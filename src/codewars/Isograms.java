package codewars;

import java.util.Scanner;

/**
 * The problem link: https://www.codewars.com/kata/54ba84be607a92aa900000f1
 */

public class Isograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isIsogram(str));
    }

    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
