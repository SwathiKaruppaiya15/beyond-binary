class Solution {
    public int maxArea(int[] height) {
        int maxA = 0;
        int i=0,j=height.length-1;
        while(i<j){
            int curA = Math.min(height[i],height[j])*(j-i);
            maxA = Math.max(maxA,curA);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxA;
    }
}