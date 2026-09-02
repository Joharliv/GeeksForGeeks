class Solution {
    public void reverse(int i , int arr[] , int n){
        if(i >= n) return;
        
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        
        reverse(i+1 , arr, n-1);
    }
    public void reverseArray(int arr[]) {
        // code here
        reverse(0 , arr , arr.length -1);
        
    }
}