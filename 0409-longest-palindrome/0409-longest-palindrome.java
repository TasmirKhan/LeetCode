class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int maxOdd = 0;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }     

        int sum = 0;
        boolean hasOdd = false;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
           if(entry.getValue() % 2 == 0) sum += entry.getValue();
           else{ hasOdd = true ;
           sum += entry.getValue() - 1;
        }
        }
        if(hasOdd) return sum + 1;
        return sum ;

    }
}