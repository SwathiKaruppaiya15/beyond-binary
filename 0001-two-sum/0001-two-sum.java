class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<n;i++){
            int val = target - nums[i];
            if(hs.containsKey(val)){
                return new int[] {i,hs.get(val)};
            }
            hs.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}