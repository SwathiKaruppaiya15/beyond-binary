class Solution {
    public int maxArea(int[] a) {
        int n = a.length;
        int l = 0, r = n-1;
        int max = 0;
        while(l<r){
            int h = Math.min(a[l],a[r]);
            int b = r-l;
            max = Math.max(max,h*b);
            if(a[l]>a[r]){
                r--;
            }else if(a[r]>a[l]){
                l++;
            }else{
                l++;
                r--;
            }
        }
        return max;
    }
}