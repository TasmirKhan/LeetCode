class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == c){st.pop();}
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            char c  = st.pop();
            sb.append(c);
        }
        sb.reverse();
        return sb.toString();
    }
}