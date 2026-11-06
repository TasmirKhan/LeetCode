class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] required = new int[26];

        for(char c : target.toCharArray()){
            required[c-'a']++;
        }

        int[] available = new int[26];
        for(int c : s.toCharArray()){
            available[c-'a']++;
        }

        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < 26 ; i++){
            if(required[i] > 0){
                int x = available[i]/required[i];
                res = Math.min(res,x);
                if(res == 0) return 0;
            }

        }

        return res;
    }
}