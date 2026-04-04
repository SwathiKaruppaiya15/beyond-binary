class Solution {
    public int maxArea(int[] a) {
        int i=0,j=a.length-1,max = Integer.MIN_VALUE;
        while(i<=j){
            int l = Math.min(a[i],a[j]);
            int b = j-i;
            int area = l*b;
            max = Math.max(max,area);
            if(a[i]<a[j]){
                i++;
            }else if(a[i]>a[j]){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return max;
    }
}