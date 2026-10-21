class Solution {
    public int minOperations(String s) {
        int n = s.length();
        if(n<=1) return 0;
        boolean sorted = true;
        int cnt = 0;

        for(int i = 1 ; i < n ; i++){
            if(s.charAt(i) < s.charAt(i-1)){sorted = false;}
        }
        if(!sorted && n == 2) return -1;
        if(sorted) return 0;

        char min = s.charAt(0);
        char max = s.charAt(0);
        for(char c : s.toCharArray()){
            if(c < min){ min = c;}
            if(c > max){ max = c;}
        }

        if(s.charAt(0) == min || s.charAt(n-1) == max) return 1;

        for(int i = 1 ; i < n-1 ; i++){
            char c = s.charAt(i);
            if(c == min || c == max) return 2;
        }

        return 3;


        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i = 0 ; i < n ; i++){
        //     map.put(s.charAt(i), i);
        // }
        
        // for(int i = 1 ; i < n  ; i++){
        //     if(s.charAt(i) < s.charAt(i-1)){
        //         map.put(s.charAt(i), i)
        //     }
        // }
    }
}   