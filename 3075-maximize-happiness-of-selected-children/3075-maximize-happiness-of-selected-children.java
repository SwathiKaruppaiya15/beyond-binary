class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);
        long ans = 0;
        int n = h.length-1;
        for(int i=0;i<k;i++){
            int val = h[n-i]-i;
            if(val>0) ans+=val;
            else break;
        }
        return ans;
    }
}