class Solution {
    public int trap(int[] a) {
        int n = a.length;
        int l = 0, r = n-1;
        int lmax = a[l], rmax = a[r];
        int ans = 0;
        while(l<r){
            if(lmax>rmax){
                r--;
                rmax = Math.max(rmax,a[r]);
                ans += rmax-a[r];
            }else{
                l++;
                lmax = Math.max(lmax,a[l]);
                ans += lmax-a[l];
            }
        }
        return ans;
    }
}