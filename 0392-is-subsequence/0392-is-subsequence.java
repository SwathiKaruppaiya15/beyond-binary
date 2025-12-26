class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,c=0;
        char vis='#';
        char a[] = t.toCharArray();
        while(i<s.length()){
            char ch = s.charAt(i);
            while(j<a.length){
                char ch2 = a[j];
                if(ch==ch2){
                    c++;
                    ch2 = vis;
                    j++;
                    break;
                }
                j++;
            }
            i++;
        }
        return c==s.length();
    }
}