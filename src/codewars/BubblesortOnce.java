package codewars;

import java.util.Arrays;

/**
 * The problem link: https://www.codewars.com/kata/56b97b776ffcea598a0006f2
 */

public class BubblesortOnce {

    public static void main(String[] args) {
        int[] array = {9, 7, 5, 3, 1, 2, 4, 6, 8};
        System.out.println(Arrays.toString(bubbleSortOnce(array)));
    }

    public static int[] bubbleSortOnce(int[] array) {
        int[] result = array.clone();
        int temp;
        for (int i = 0; i < result.length -1; i++) {
            if (result[i] > result[i + 1]) {
                temp = result[i];
                result[i] = result[i + 1];
                result[i + 1] = temp;
            }
        }
        return result;
    }
}
