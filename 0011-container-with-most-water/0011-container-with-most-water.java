class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int i=0,j=n-1,max=0;
        while(i<j){
            int w = j-i;
            int he = Math.min(h[i],h[j]);
            int a = he*w;
            max = Math.max(max,a);
            if(h[i]<h[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}