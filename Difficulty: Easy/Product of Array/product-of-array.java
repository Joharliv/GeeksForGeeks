class Solution {
    public long product(long arr[]) {
        // code here
        long ans = 1;
        long mod = 1000000007;
        for(long i : arr){
            ans = (ans*i)%mod;
        }
        return ans;
    }
}