import java.util.Arrays;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0,r=0,max=0;
        int hm[]= new int[256];
        Arrays.fill(hm,-1);
        while(r<n){
            char c = s.charAt(r);
            if(hm[c]!=-1){
                if(hm[c]>=l){
                    l = hm[c]+1;
                }
            }
            max = Math.max(max,r-l+1);
            hm[c] = r;
            r++;
        }
        return max;
    }
}