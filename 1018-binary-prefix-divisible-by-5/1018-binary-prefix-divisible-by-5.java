class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int prev = 0;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            prev = (prev*2+val)%5;
            ans.add(prev==0);
        }
        return ans;
    }
}