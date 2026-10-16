class Solution {
    public boolean checkGoodInteger(int n) {
        long sum = 0;
        long sqsum = 0;

        while(n > 0){
            int digit = n%10;
            n/=10;

            sum += digit;
            sqsum += (digit*digit);
        }

        return (sqsum -sum) >=50;
    }
}