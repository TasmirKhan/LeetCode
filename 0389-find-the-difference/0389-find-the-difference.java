class Solution {
    public char findTheDifference(String s, String t) {

        // Approach 1. Xoring the same value twice will make it 0 eventually.

        char xor = 0;
        for(char c : s.toCharArray()) xor ^= c;
        for(char c : t.toCharArray()) xor ^= c;

        return xor;


        // Approach 2.Array Hashing
//         int[] arr = new int[26];
//         for(char x : s.toCharArray()){
//             arr[x - 'a']++;
//         }
//         for(char x : t.toCharArray()){
//            arr[x - 'a']--;
// }
        
//         for(int i = 0 ; i < arr.length ; i++){
//             if(arr[i] != 0) return (char)('a' + i );
//         }

//         return 'a';
    }
}