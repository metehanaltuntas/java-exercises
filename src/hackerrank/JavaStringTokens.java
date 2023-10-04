package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * The problem link: https://www.hackerrank.com/challenges/java-string-tokens/problem
 */

public class JavaStringTokens {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        List<String> tokens = Arrays.asList(s.trim().split("[ !,?._'@]+"));

        if (tokens.size() == 1 && tokens.get(0).isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.size());
            tokens.forEach(System.out::println);
        }

    }
}
