class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        if(n<3) return 0;
        int lmax = nums[0];
        Stack<Integer> rmax = new Stack<>();
        rmax.push(nums[n-1]);
        for(int i=n-2;i>=1;i--){
            int max = Math.max(rmax.peek(),nums[i]);
            rmax.push(max);
        }
        int total = 0;
        for(int i=1;i<n-1;i++){
            int mini = Math.min(lmax,rmax.peek());
            int tem = mini-nums[i];
            total+=Math.max(tem,0);
            rmax.pop();
            lmax = Math.max(nums[i],lmax);
        }
        return total;
    }
}