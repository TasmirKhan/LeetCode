class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int a  = x;
        while(x > 0){
          int y = x%10;
          sum = sum*10 + y;          
          x = x/10;
        }
        return a == sum;
    }
}