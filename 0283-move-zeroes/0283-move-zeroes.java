class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int ind = 0, c = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[ind++] = nums[i];
            }else{
                c++;
            }
        }
        for(int i=0;i<c;i++){
            nums[ind++] = 0;
        }
    }
}