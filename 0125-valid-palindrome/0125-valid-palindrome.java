class Solution {
    public boolean isPalindrome(String t) {
        String s = t.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String st = sb.toString();
        int i=0,j=sb.length()-1;
        while(i<=j){
            char ch1 = st.charAt(i);
            char ch2 = st.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}