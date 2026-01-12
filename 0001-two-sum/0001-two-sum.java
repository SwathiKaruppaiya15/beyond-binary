import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int v = target-nums[i];
            if(hs.containsKey(v)){
                return new int[] {hs.get(v),i};
            }
            hs.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}