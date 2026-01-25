class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min  = Integer.MAX_VALUE,j=k-1;
        for(int i=0;i+j<nums.length;i++){
            min = Math.min(min,nums[i+j]-nums[i]);
        }
        return min;
    }
}