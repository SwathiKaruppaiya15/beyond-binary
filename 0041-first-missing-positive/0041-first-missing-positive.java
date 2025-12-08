class Solution {
    public int firstMissingPositive(int[] arr) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int n : nums) set.add(n);
        // int i = 1;
        // while (set.contains(i)) i++;
        // return i;

        int n = arr.length;
        int i=0;
        while(i<n){
            if(arr[i] <= 0 || arr[i] > n || arr[i] == i+1 || arr[i] == arr[arr[i]-1])i++;
            else{
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
        for(i=0; i<n; i++){
            if(arr[i] != i+1)return i+1;            
        }
        return n+1;
    }
}