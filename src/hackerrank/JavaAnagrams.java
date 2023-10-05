package hackerrank;

import java.util.Scanner;

/**
 * The problem link: https://www.hackerrank.com/challenges/java-anagrams/problem
 */

public class JavaAnagrams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next().toLowerCase();
        String b = scan.next().toLowerCase();
        scan.close();

        System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] letters = new int[26];
        for (int i = 0; i < a.length(); i++) {
            letters[a.charAt(i) - 'a']++; // 'a' - 'a' = 0, 'b' - 'a' = 1, 'c' - 'a' = 2, ...
            letters[b.charAt(i) - 'a']--;
        }

        for (int letter : letters) {
            if (letter != 0) {
                return false;
            }
        }
        return true;
    }

}
