class Solution {
    public int longestOnes(int[] a, int k) {
        int n = a.length;
        int l=0,r=0,max=0,zc=0;
        while(r<n){
            if(a[r]==0) zc++;
            while(zc>k){
                if(a[l]==0){
                    zc--;
                }
                l++;
            }
            if(zc<=k){
                max = Math.max(max,r-l+1);
            }
            r++;
        }   
        return max;
    }

}