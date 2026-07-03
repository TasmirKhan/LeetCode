class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        int cnt = 0;
        while(n!=0){
            int temp = (n) & 1;
            if(temp == 1) cnt++;
            n = n>>1;
            if(cnt > 0 && n > 0) return false;
        }

        return cnt == 1;
    }
}