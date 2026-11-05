class Solution {
    public String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            int n = sb.length();
            if(n > 0 && sb.charAt(n-1) == c){
                sb.deleteCharAt(n-1);
            }
            else{ sb.append(c); }
        }

        return sb.toString();

        // approach 2
        // Stack<Character> st = new Stack<>();
        // for(char c : s.toCharArray()){
        //     if(!st.isEmpty() && st.peek() == c){st.pop();}
        //     else{
        //         st.push(c);
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // while(!st.isEmpty()){
        //     char c  = st.pop();
        //     sb.append(c);
        // }
        // sb.reverse();
        // return sb.toString();
    }
}