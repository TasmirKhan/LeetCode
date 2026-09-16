class Solution {
    public int findComplement(int num) {
         int ans = 0;
        int i = 0;
        while(num > 0){
            int x = num%2;
            if(x == 0) x = 1;
            else if(x == 1) x = 0;
            ans = ans + (int)(Math.pow(2,i) * x);
            num /=2;
            i++;

        }
        return ans;
    }
}