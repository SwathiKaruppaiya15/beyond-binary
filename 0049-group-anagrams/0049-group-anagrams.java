class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
    //     int n = s.length;
    //     List<List<String>> res = new ArrayList<>();
    //     boolean vis[] = new boolean[n];
    //     for(int i=0;i<n;i++){
    //         if(!vis[i]) {
    //             res.add(anam(s[i], i, s, n, vis));
    //         }
    //     }
    //     return res;
    // }
    // public List<String> anam(String t, int j, String[] s, int n,boolean[] vis)
    // {
    //     List<String> li = new ArrayList<>();
    //     vis[j] = true;
    //     li.add(t);
    //     char ch1[] = t.toCharArray();
    //     Arrays.sort(ch1);
    //     for(int i=0;i<n;i++){
    //         if(i!=j && !vis[i]){
    //             char ch2[] = s[i].toCharArray();
    //             Arrays.sort(ch2);
    //             if(Arrays.equals(ch1,ch2)){
    //                 String a = new String(s[i]);
    //                 li.add(a);
    //                 vis[i] = true;
    //             }
    //         }
    //     }
    //     return li;
    // }

        Map<String, List<String>> map = new HashMap<>();
        for (String word : s) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}