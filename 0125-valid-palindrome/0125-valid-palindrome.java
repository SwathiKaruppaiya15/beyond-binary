import java.util.Collections;
class Solution {
    public boolean isPalindrome(String t) {
        int l=0,r=t.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(t.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(t.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(t.charAt(l))!=Character.toLowerCase(t.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}