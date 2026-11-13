class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if( c== '[' || c == '(' || c == '{') st.push(c);
            else if(!st.isEmpty()){
                char popped = st.pop();
                if(c == ']' && popped != '['){ return false;}
                if(c == '}' && popped != '{'){ return false;}
                if(c == ')' && popped != '('){ return false;}
            }
            else{
                return false;
            }
        }

        return st.isEmpty();
    }
}