class Solution {
    public long getDescentPeriods(int[] nums) {
        long ans  = 1, cou = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]+1==nums[i-1]) cou++;
            else cou = 1;
            ans+=cou;
        }
        return ans;
    }
}