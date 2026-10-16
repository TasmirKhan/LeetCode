class Solution {
    public boolean validDigit(int n, int x) {
        if(n < 10) return false;
        int num = n;
        boolean foundX = false;
        while(num >= 10){
            int digit = num%10;
            if(digit == x) foundX = true;
            num /= 10;
        }

        if(num == x) return false;

        return foundX;
    }
}