class Solution {
    public int balancedStringSplit(String s) {
        int x = 0;
        int ans = 0;
        for(char c : s.toCharArray()){
            if(c == 'R'){x++;}
            else{x--;}
            if(x == 0){ans++;}
        }

        return ans;
    }
}