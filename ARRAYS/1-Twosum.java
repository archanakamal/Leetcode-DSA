/*
Problem: Two Sum
LeetCode: https://leetcode.com/problems/two-sum/
Difficulty: Easy

Description:
Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target.

Approach:
- Use a HashMap to store numbers and their indices.
- For each number, check if target - number exists in map.
- If yes, return the indices.
- Otherwise, store number with its index in map.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
