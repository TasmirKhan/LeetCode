class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) return true;
        if( x == 10 || x%10 == 0) return false;
        if(x < 0) return false;
        int revHalf = 0;
        while(x > revHalf){
            int a = x%10;
            revHalf = revHalf*10 + a;
            x = x/10;
        }

        return (x == revHalf) || (x == revHalf/10);
        // int sum = 0;
        // int a  = x;
        // while(x > 0){
        //   int y = x%10;
        //   sum = sum*10 + y;          
        //   x = x/10;
        // }
        // return a == sum;
    }
}