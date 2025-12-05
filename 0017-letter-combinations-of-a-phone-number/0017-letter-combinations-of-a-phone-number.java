class Solution {
    private static final Map<Character, String> MAP = new HashMap<>();
    static {
        MAP.put('2', "abc");
        MAP.put('3', "def");
        MAP.put('4', "ghi");
        MAP.put('5', "jkl");
        MAP.put('6', "mno");
        MAP.put('7', "pqrs");
        MAP.put('8', "tuv");
        MAP.put('9', "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return list;
        }
        backTrack(0,digits,new StringBuilder(),list);
        return list;    
    }
    private void backTrack(int index,String digits,StringBuilder sb,List<String> list){
        if(index==digits.length()){
            list.add(sb.toString());
            return ;
        }
        String first=MAP.get(digits.charAt(index));
         for (int i = 0; i < first.length(); i++) {
            sb.append(first.charAt(i));
            backTrack(index+1,digits,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }

    }
} 