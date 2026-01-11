class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        String vis = "##";
        int n = strs.length;
        for(int i=0;i<n;i++){
            if(!strs[i].equals(vis)){
                List<String> ans = new ArrayList<>();
                ans.add(strs[i]);
                for(int j=i+1;j<n;j++){
                    if(sameAnam(strs[i],strs[j])){
                        ans.add(strs[j]);
                        strs[j] = vis;
                    }
                }
                res.add(ans);
            }
        }
        return res;
    }
    public static boolean sameAnam(String s, String t)
    {
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}