class Solution {
    public boolean checkRecord(String s) {
        int a = 0, l = 0;
        for(char c : s.toCharArray()){
            if( c == 'A'){
                l = 0;
                a++;
                if(a >= 2) return false;
            }
            else if( c == 'L'){
                l++;
                if(l >= 3) return false;
            }
            else{ l = 0;}
        }

        return true;
    }
}