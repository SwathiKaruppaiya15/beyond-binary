class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int c =0;
        for(int i=0;i<n;i++){
            if(i<n-1 && nums[i]>nums[i+1]) c++;
            else if(i==n-1 && nums[i]>nums[0]) c++;
        }
        return c>1?false:true;
    }
}