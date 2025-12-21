class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length-1){
            if(nums[j]!=nums[i]){
                nums[i] = nums[j];
                i++;
                j++;
            }
            j++;
            
        }
        return i+1;
    }
}