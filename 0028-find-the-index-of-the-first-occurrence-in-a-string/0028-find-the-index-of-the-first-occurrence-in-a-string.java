class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        int[] lps = new int[n];

        int len = 0;
        for(int i =  1 ; i<n ; ){
            if(needle.charAt(len) == needle.charAt(i)){
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

        //lps done
         int i = 0;
         int j = 0;
         while(i<h){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++; j++;
                if(j==n){return i-j;}
            }
            else{
               if(j>0){ j = lps[j-1];}
               else{ i++;}
            }
         }
         return -1;
    }
}