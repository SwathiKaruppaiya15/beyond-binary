class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int max = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int idx = sb.indexOf(String.valueOf(ch));
            if (idx != -1) {
                sb.delete(0, idx + 1);
            }
            sb.append(ch);
            max = Math.max(max,sb.length());
        }
        return max;
    }
}