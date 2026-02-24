class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int ind = 0;
        int a[] = new int[n+m];
        for(int i=0;i<n+m;i++){
            if(i<n){
                a[i] = nums1[i];
            }else{
                a[i] = nums2[ind++];
            }
        }
        Arrays.sort(a);
        int len = n+m;
        int mid = len/2;
        if(len%2==0){
            int mid2 = mid-1;
            double ans = (a[mid]+a[mid2])/2.0;
            return ans;
        }
        double ans = a[mid];
		return ans;
    }
}