/*
 LeetCode: Two Sum
 Problem: https://leetcode.com/problems/two-sum/
 Difficulty: Easy
 Language: Java
 Time: O(n)
 Space: O(n)
*/

import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            Solution sol = new Solution();
            int res[] = sol.twoSum(a, target);

            System.out.println(res[0] + " " + res[1]);
        }
    }
}