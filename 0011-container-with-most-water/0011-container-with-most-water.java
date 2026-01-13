class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int i=0,j=n-1,max = Integer.MIN_VALUE;
        while(i<=j){
            int w = j-i;
            int l = Math.min(h[i],h[j]);
            int area = l*w;
            max = Math.max(max,area);
            if(h[i]<h[j]) i++;
            else j--;
        }
        return max;
    }
}