import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        for (int n : nums1) {
            h1.add(n);
        }
        HashSet<Integer> h2 = new HashSet<>();
        for (int n : nums2) {
            h2.add(n);
        }
        h1.retainAll(h2);
        int a[] = new int[h1.size()];
        int ind = 0;
        for(int i:h1){
            a[ind++] = i;
        }
        return a;
    }
}