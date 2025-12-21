class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,ind = 0,c=0;
        while(l<nums.length){
            if(nums[l]!=0){
                nums[ind] = nums[l];
                ind++;
            }
            if(nums[l]==0){
                c++;
            }
            l++;
        }
        int r=nums.length-1;
        while(c>0){
            nums[r] = 0;
            c--;
            r--;
        }
    }
}