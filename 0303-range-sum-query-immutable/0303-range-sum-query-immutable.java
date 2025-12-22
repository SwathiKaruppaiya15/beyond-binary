class NumArray {
    private int[] px;
    public NumArray(int[] nums) {
        int n = nums.length;
        px = new int[n];
        px[0] = nums[0];
        for(int i=1;i<n;i++){
            px[i] = px[i-1]+nums[i]; 
        }
    }
    
    public int sumRange(int l, int r) {
        if(l==0) return px[r];
        int ans = px[r]-px[l-1];
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */