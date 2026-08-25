class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() == 1) return false;
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c=='['){
                st.push(c);
            }
            if(c == ')' || c == '}' || c == ']'){
                if(st.isEmpty()) return false;
                char x = st.pop();
               if(c== ')' && x == '(')continue;
               else if(c== ']' && x == '[')continue;
               else if(c== '}' && x == '{')continue;
               else return false;
            }
        }
        return st.isEmpty();
    }
}