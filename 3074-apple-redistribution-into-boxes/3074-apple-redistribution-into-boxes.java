class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int tot=0;
        for(int i=0;i<apple.length;i++){
            tot+=apple[i];
        }
        Arrays.sort(capacity);
        int sum=0,c=0;
        for(int i=capacity.length-1;i>=0;i--){
            sum+=capacity[i];
            c++;
            if(sum>=tot){
                break;
            }
        }
        return c;
    }
}