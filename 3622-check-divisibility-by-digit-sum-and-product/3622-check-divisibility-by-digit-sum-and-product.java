class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0;
        long prod = 1;
        int temp = n;
        while(temp > 0){
            int digit = temp%10;
            sum += digit;
            prod *=digit;
            temp /= 10;
        }

        long fsum = sum + prod;

        return (n%fsum == 0);
    }
}