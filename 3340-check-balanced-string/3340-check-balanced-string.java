class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        if(n < 1) return true;
        if(n == 1) return false;

        int i = 0, j = 1;
        int sum1 = 0, sum2 = 0;

        while( i < n ){
            int x = num.charAt(i) - '0';
           
            sum1 += x;
           
            i += 2;
            
            if(j < n){
                 int y = num.charAt(j) - '0';
                  sum2 += y;
                  j += 2;
            }
        }

    


        return sum1 == sum2;

    }
}