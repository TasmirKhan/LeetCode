class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pos =  0, other = 0, n = moves.length();
        for(char c : moves.toCharArray()){
            
            if(c == 'L'){ pos--;}
            else if(c == 'R'){ pos++;}
            else { other++;}
        }
        return Math.abs(pos) + other;


        // int left = 0, right = 0, other = 0, n = moves.length();
        // for(int i = 0 ; i < n ; i++){
        //     char c = moves.charAt(i);
        //     if(c == 'L'){ left++;}
        //     else if(c == 'R'){ right++;}
        //     else { other++;}
        // }
        // if(left > right){
        //     return left + other - right;
        // }
        // return right + other - left;

    }
}