class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int q = n/8;
        int rem = n%8;

        return 8*q*(q+1)/2 + (q+1)*rem;
        // if(q == 0) return n;
        // else if( q == 1) return 8 + 2*rem;
        // else if(q == 2) return 24 + 3*rem;
        // else if(q == 3) return 48 + 4*rem;

        // return -1;

        // int n = word.length();
        // if(n <= 8) return n;
        // else if(n <= 16){
        //     int x = n-8;
        //     return 8 + (2*x);
        // }
        // else if(n <= 24){
        //     int x = n-16;
        //     return 8 + 16 + (3*x);
        // }
        // else if(n <= 26){
        //     int x = n-24;
        //     return 8 + 16 + 24 + (4*x);
        // }
        // return -1;
    }
}