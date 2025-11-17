class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(strs==null || n<1) return "";
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[n-1];
        int i=0;
        while(i<f.length()){
            if(f.charAt(i)==l.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return f.substring(0,i);
    }
}