class Solution {
    public char findTheDifference(String s, String t) {
        //HashSet<Character> set = new HashSet<>();
        int[] arr = new int[26];
        char y = ' ';
        for(char x : s.toCharArray()){
            arr[x - 'a']++;
        }
        for(char x : t.toCharArray()){
           arr[x - 'a']--;
}
        
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0) return (char)('a' + i );
        }

        return 'a';
    }
}