package easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate/
 *
 Given an array of integers, find if the array contains any duplicates.
 Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public class Solution {
        public boolean containsDuplicate(int[] nums) {
            // If nums is null or contains 0 - 1 entries return false - there can't be duplicates.
            // Add elements to set - allMatch is short-circuiting so once a duplicate is added we can return true.
            // allMatch will return false if there's a duplicate (Set::add returns false if entry already existed.)
            return !(nums == null || nums.length <= 1) && !Arrays.stream(nums).allMatch(new HashSet<>()::add);
        }
    }
}
