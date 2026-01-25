class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min  = Integer.MAX_VALUE,j=k-1;
        for(int i=0;i<=nums.length-k;i++){
            min = Math.min(min,nums[i+k-1]-nums[i]);
        }
        return min;
    }
}