class Solution {
    public boolean buddyStrings(String s, String goal) {
        int slen = s.length();
        int glen = goal.length();
        if(slen != glen) return false;
        int[] arr = new int[26];
        boolean dup = false;

        for(char c : s.toCharArray()){
            int val = c - 'a';
            arr[val]++;
            if(arr[val] >= 2) dup = true;
        }

        if(s.equals(goal) && dup){ return true;}
        if(s.equals(goal) && !dup){ return false;}



        for(char c : goal.toCharArray()){
            int val = c - 'a';
            arr[val]--;
        }


        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] != 0) return false;
        }

        int cnt = 0;
        for(int i = 0 ; i < slen; i++){
            if(s.charAt(i) != goal.charAt(i)) cnt++;
        }
        if(cnt == 2) return true;
        return false;

    }
}