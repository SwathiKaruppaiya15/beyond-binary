class Solution {
    public int maxSubArray(int[] nums) {
        // int n = nums.length;
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         int l=i,r=j;
        //         int sum = 0;
        //         while(l<=j){
        //             sum+=nums[l];
        //             l++;
        //         }
        //         if(sum>max) max = sum;
        //     }
        // }
        // return max;

        int max = nums[0];
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(max+nums[i], nums[i]);
            res = Math.max(max,res);
        }
        return res;
    }
}