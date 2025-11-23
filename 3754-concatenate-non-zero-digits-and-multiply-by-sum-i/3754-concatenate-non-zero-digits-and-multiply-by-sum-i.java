class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        while(n>0){
            int d = n%10;
            if(d!=0) x = (x*10)+d;
            n/=10;
        }
        int temp = rev(x);
        int sum = 0;
        while(x>0){
            sum+=(x%10);
            x/=10;
        }
        return (long)temp*sum;
    }
    public static int rev(int x)
    {
        int r = 0;
        while(x>0){
            int d = x%10;
            r=(r*10)+d;
            x/=10;
        }
        return r;
    }
}