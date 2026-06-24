class Solution {
    public int maxDepth(String s) {
        int opBracs =0;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                opBracs++;
            }
            else if(c == ')'){
                opBracs--;
            }
            max = Math.max(max,opBracs);
        }
        return max;
    }
}