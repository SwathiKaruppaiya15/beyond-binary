class Solution {
    public int maxArea(int[] a) {
        int n = a.length;
        int l = 0, r = n-1;
        int max = 0;
        while(l<r){
            int h = Math.min(a[l],a[r]);
            int b = r-l;
            int area = h*b;
            max = Math.max(max,area);
            if(a[l]<a[r]){
                l++;
            }else if(a[l]>a[r]){
                r--;
            }else{
                l++;
                r--;
            }
        }
        return max;
    }
}