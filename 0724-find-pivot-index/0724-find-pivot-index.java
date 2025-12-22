class Solution {
    public int pivotIndex(int[] nums) {
        int tot = 0, sum=0, n= nums.length;
        for(int i=0;i<n;i++){
            tot+=nums[i];
        }
        for(int i=0;i<n;i++){
            if(tot-sum-nums[i]==sum) return i;
            sum+=nums[i];
        }
        return -1;
    }
}