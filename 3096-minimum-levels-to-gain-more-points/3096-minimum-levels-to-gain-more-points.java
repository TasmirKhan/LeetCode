class Solution {
    public int minimumLevels(int[] possible) {
        int n = possible.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        int curr = 0, bcurr = 0;
        for(int i = 0 ; i < n ; i++){
            int a = possible[i];
            int b = possible[n-i-1];

            if( a == 1){
                pre[i] = curr+1;
                curr += 1;
            }
            else{ 
                pre[i] = curr - 1;
                curr -= 1;
            }

            if(b == 1){
                suff[n-i-1] = bcurr + 1;
                bcurr += 1;
            }
            else{
                suff[n-i-1] = bcurr - 1;
                bcurr -= 1;
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(pre[i] >= suff[i] && i+1 < n && suff[i+1] < pre[i]){
                return i+1;
            }
        }

        return -1;

    }
}