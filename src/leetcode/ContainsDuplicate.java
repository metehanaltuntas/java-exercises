package leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * The problem link: https://leetcode.com/problems/contains-duplicate/
 */

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int num: nums) {
            if (!integers.add(num)) {
                return true;
            }
        }
        return false;
    }

}
