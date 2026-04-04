class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        Arrays.fill(a,1);
        int left = 1, right = 1;
        for(int i=0;i<n;i++){
            a[i] *= left;
            left*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            a[i] *= right;
            right*=nums[i];
        }
        return a;
    }
}