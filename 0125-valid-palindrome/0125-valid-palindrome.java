class Solution {
    public boolean isPalindrome(String t) {
        int m = t.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            if(Character.isLetterOrDigit(ch)) sb.append(ch);
        }
        String s =  sb.toString().toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1!=c2) return false;
            i++;
            j--;
        }
        return true;
    }
}