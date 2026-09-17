class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int x = num;
        for(int i = 1 ; i*i <= num ; i++){
            if(num%i == 0){
                sum += i;
                if(i != num/i){ sum += num/i; }
            }
        }
        sum -= num;
        return sum == x;
    }
}