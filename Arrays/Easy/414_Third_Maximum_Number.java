/*
 LeetCode: 414. Third Maximum Number
 Problem: https://leetcode.com/problems/third-maximum-number
 Difficulty: Easy
 Language: Java
 Time: O(n)
 Space: O(n)
*/

import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            if (!hs.contains(val)) {
                hs.add(val);
            }
        }
        int m = hs.size();
        int max = Integer.MIN_VALUE;
        for (int i : hs) {
            max = Math.max(max, i);
        }
        if (m <= 2) {
            return max;
        }
        int sec = Integer.MIN_VALUE;
        for (int i : hs) {
            if (i < max && i > sec) {
                sec = i;
            }
        }
        int third = Integer.MIN_VALUE;
        for (int i : hs) {
            if (i < max && i < sec && i > third) {
                third = i;
            }
        }
        return third;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.thirdMax(nums);
        System.out.println("Third maximum (or max if fewer than 3 distinct): " + result);
        sc.close();
    }
}
