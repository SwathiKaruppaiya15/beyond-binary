class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,tot=0;
        for(int i:nums) tot+=i;
        int sum = (n*(n+1))/2;
        return sum-tot;
    }
}