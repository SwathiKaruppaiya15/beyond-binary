import java.util.Arrays;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0,r=0,max=0;
        int hash[] = new int[256];
        Arrays.fill(hash,-1);
        while(r<n){
            char c = s.charAt(r);
            if(hash[c]!=-1){
                if(hash[c]>=l){
                    l = hash[c]+1;
                }
            }
            max = Math.max(max,r-l+1);
            hash[c] = r;
            r++;
        }
        return max;
    }
}