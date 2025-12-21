import java.util.HashMap;
class Solution {
    public int totalFruit(int[] a) {
        int k=2;
        int n = a.length;
        int l=0,r=0,max=0;
        Map<Integer,Integer> mp = new HashMap<>();
        while(r<n){
            mp.put(a[r],mp.getOrDefault(a[r],0)+1);
            while(mp.size()>k){
                mp.put(a[l],mp.get(a[l])-1);
                if(mp.get(a[l])==0){
                    mp.remove(a[l]);
                }
                l++;
            }
            if(mp.size()<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}