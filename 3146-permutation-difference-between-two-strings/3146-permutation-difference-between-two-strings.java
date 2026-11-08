class Solution {
    public int findPermutationDifference(String s, String t) {
        int n = s.length();
        int res = 0;
        int[] arr = new int[26];
        for(int i = 0 ; i < n ; i++){
            int c = s.charAt(i) - 'a';
            arr[c] = i;
        }

        for(int i = 0 ; i < n ; i++){
            int c = t.charAt(i) - 'a'; 
            int temp = Math.abs(i - arr[c]);
            res += temp;
        }

        return res;
    }
}