class Solution {
    public String longestPrefix(String s) {

        //Best KMP/LPS
        int n = s.length();
        int[] lps= new int[n];

        int len = 0;
        for(int i = 1 ; i<n;){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len > 0){
                    len = lps[len-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return s.substring(0,lps[n-1]);
        //Better approach
        // int n = s.length();

        // for(int len = n-1 ; len>=1 ; len--){
        //     String pre = s.substring(0,len);
        //     String suf = s.substring(n-len);
        //     if(pre.equals(suf)){
        //         return pre;
        //     }
        // }
        // return "";
        // //brute:
        // int n = s.length();
        // for(int len = n-1 ; len>=1 ; len--){
        //     boolean match = true;

        //     for(int i = 0 ; i<len ; i++){
        //         if(s.charAt(i) != s.charAt(n-len+i)){
        //             match = false;
        //             break;
        //         }
        //     }

        //     if(match){
        //         return s.substring(0,len);
        //     }
        // }
        // return "";
    }
}