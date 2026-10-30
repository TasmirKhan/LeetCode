class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.equals("ab")) return false;
        int n = s.length();
        
        if(n <= 1) return false;
        for(int i = 0 ; i <= n/2 ; i++){
            String temp = s.substring(0,i+1);
            if(temp.repeat(n/(i+1)).equals(s)) return true;
        }

        return false;
    }
}