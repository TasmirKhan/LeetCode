class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        long ans = 0;
        boolean negative = false;
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == '-' && i == 0){ negative = true;}
            else if(i == 0 && s.charAt(i) == '+'){ continue; }
            else if(Character.isDigit(s.charAt(i))){
                int a = s.charAt(i) - '0';
                ans = (ans*10) + a;
                
        if(negative && (ans >= -(long)Integer.MIN_VALUE )){ return Integer.MIN_VALUE;} 
        if(!negative && (ans >= (long)Integer.MAX_VALUE)){ return Integer.MAX_VALUE;}
            }
            else{ break; }
        }


        if(negative) return (-1)*(int)ans;
        return (int)ans;
    }
}