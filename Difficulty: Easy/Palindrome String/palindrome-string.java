class Solution {
       public boolean reverse(String s , int l , int r){
        
        if(l >= r) return true;
        
        if(s.charAt(l) != s.charAt(r)) return false;
         
        return reverse(s , l+1 , r -1);
        
    }
    boolean isPalindrome(String s) {
        // code here
        int l = 0;
        int r = s.length() - 1;
        
        return reverse(s , l , r);
        
        
        
        
        
    }
}