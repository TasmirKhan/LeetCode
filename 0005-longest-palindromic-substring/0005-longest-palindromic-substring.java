class Solution {
    public static boolean isPalindrome(String s, int low, int high){
        
        while(low < high){
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
         int n = s.length();
         
         String ans = "";
         for(int i =0 ; i< n ; i++){
            for(int j = i ; j<n ; j++){
                if(isPalindrome(s, i , j)){
                    if(ans.length() <= (j-i+1)){
                        ans = s.substring(i,j+1);
                    }
                }
            }
         }
        return ans;
    }
}