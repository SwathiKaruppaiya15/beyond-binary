class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            int num = nums[i];
            int tempMax = Math.max(num,Math.max(curMax*num, curMin*num));
            int tempMin = Math.min(num,Math.min(curMax*num, curMin*num));
            curMax = tempMax;
            curMin = tempMin;
            max = Math.max(max,curMax);
        }
        return max;
    }
}