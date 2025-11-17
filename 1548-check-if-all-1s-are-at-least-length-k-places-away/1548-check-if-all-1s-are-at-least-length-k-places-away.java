class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int c = -1;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                if(c!=-1 && i-c-1<k) return false;
                c = i;
            }
        }
        return true;
    }
}