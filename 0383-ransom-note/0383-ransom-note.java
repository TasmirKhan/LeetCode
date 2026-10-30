class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] availableWords = new int[26];

       for(char c : magazine.toCharArray()){
        availableWords[c - 'a']++;
       }

       for(char c : ransomNote.toCharArray()){
        if(--availableWords[c-'a'] < 0){ return false;}
       }

       return true;


        
    }
}