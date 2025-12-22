class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int px[] = new int[n];
        int sx[] = new int[n];
        px[0] = nums[0];
        for(int i=1;i<n;i++){
            px[i] = px[i-1]*nums[i];
        }
        sx[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            sx[i] = sx[i+1]*nums[i];
        }
        for(int i=0;i<n;i++){
            int lm = 1,rm = 1;
            if(i!=0){
                lm = px[i-1];
            }
            if(i!=n-1){
                rm = sx[i+1];
            }
            nums[i] = lm*rm;
        }
        return nums;
    }
}