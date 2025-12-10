class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int deviation = 0;
        for(int i=0;i<n;i++){
            if(i<n-1 && nums[i]>nums[i+1]){
                deviation++;
            }else if(i==n-1 && nums[i]>nums[0]){
                deviation++;
            }
        }
        if(deviation>1) return false;
        return true;
    }
}