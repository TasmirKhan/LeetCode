// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashSet<Character> set = new HashSet<>();
//         int n = s.length();
//         int i=0,j=0; int x =0;
//         while(j<n){
//             if(!set.contains(s.charAt(j))){
//                 set.add(s.charAt(j));
//                 x = Math.max(x,set.size());
//                 j++;
//             }
//             else{
                
//                 set.remove(s.charAt(i));
//                 i++;
//             }
//         }
//         return x;
//     }
// // }
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int maxLength = 0;
//         int[] lastIndex = new int[128];
        
//         for (int start = 0, end = 0; end < n; end++) {
//             char currentChar = s.charAt(end);
//             start = Math.max(start, lastIndex[currentChar]);
//             maxLength = Math.max(maxLength, end - start + 1);
//             lastIndex[currentChar] = end + 1;
//         }
        
//         return maxLength;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left =0,right =0; int max =0;
       HashSet<Character> set = new HashSet<>();
       while(right<s.length()){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            max = Math.max(max,right-left+1);
            set.add(ch);
            right++;
             
       }
       return max;
    }
}

