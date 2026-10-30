// // class Solution {
// //     public boolean repeatedSubstringPattern(String s) {
// //         if(s.equals("ab")) return false; // hardcoded value
// //         int n = s.length();
        
// //         if(n <= 1) return false;
// //         for(int i = 0 ; i <= n/2 ; i++){
// //             String temp = s.substring(0,i+1);
// //             if(temp.repeat(n/(i+1)).equals(s)) return true;
// //         }

// //         return false;
// //     }
// // }
// class Solution {
//     public boolean repeatedSubstringPattern(String s) {
//         String har = s + s;
//         return  har.substring(1 , har.length()-1).contains(s);
     

//     }
// }
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();
        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        while(i < n){

            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{

                if(len != 0){
                    len = lps[len - 1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int patternLength = n - lps[n-1];

        return lps[n-1] > 0 && n % patternLength == 0;
    }
}