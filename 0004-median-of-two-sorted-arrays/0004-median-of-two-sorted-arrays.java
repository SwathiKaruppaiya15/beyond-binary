import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int fin[] = new int[n+m];
        for(int i=0;i<n;i++){
            fin[i] = nums1[i];
        }
        for(int j=0;j<m;j++){
            fin[j+n] = nums2[j];
        }
        Arrays.sort(fin);
        int tot = n+m;
        if(tot%2==0){
            return (fin[tot/2]+fin[tot/2-1])/2.0;
        }
        return fin[tot/2];
    }
}