class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, other = 0;
        for(char c : moves.toCharArray()){
            if(c == 'L'){ left++;}
            else if(c == 'R'){ right++;}
            else { other++;}
        }
        if(left > right){
            return left + other - right;
        }
        return right + other - left;

    }
}