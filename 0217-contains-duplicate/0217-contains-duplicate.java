class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // for(int i=0;i<n-1;i++){    ===>>> TLE o(n^2)
        //     int c = 1;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             c++;
        //         }
        //         if(c>=2) return true;
        //     }
        // }
        // return false;

        // HashMap<Integer, Integer> hm = new HashMap<>();   //===>>> o(2n)
        // for(int i=0;i<n;i++){
        //     hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        // }
        // for(Integer i:hm.values()){
        //     if(i>=2) return true;
        // }
        // return false;
        
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
}