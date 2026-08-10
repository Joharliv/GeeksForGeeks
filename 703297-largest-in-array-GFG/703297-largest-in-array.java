class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = -1;
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna