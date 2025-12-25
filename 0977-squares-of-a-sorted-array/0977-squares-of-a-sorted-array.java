class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        int i = 0,j = n-1, k= n-1;
        while(i<=j){
            int l = nums[i]*nums[i];
            int r = nums[j]*nums[j];
            if(l>r){
                a[k] = l;
                i++;
            }else {
                a[k] = r;
                j--;
            }
            k--;
        }
        return a;
    }
}