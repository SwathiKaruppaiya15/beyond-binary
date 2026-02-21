class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String a = sb.toString();
        int i=0,j=a.length()-1;
        while(i<=j)
        {
            if(a.charAt(i)!=a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}