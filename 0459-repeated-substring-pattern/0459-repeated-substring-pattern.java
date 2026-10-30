class Solution {
    public boolean repeatedSubstringPattern(String s) {

        
        // Approach 2. Direct Approach
        String x = s + s;
        return x.substring(1,x.length()-1).contains(s);


        // Approach 3. Checking whether part of string can become the original String.
        // if(s.equals("ab")) return false; // hardcoded value
        // int n = s.length();
        
        // if(n <= 1) return false;
        // for(int i = 0 ; i <= n/2 ; i++){
        //     String temp = s.substring(0,i+1);
        //     if(temp.repeat(n/(i+1)).equals(s)) return true;
        // }

        // return false;
    }
}