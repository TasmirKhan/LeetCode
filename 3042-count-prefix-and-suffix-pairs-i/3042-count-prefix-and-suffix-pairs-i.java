class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt = 0;
        int n = words.length;
        for(int i = 0 ; i < n-1; i++){
            String str1 = words[i];        
            for(int j = i+1; j < n; j++){
                String str2 = words[j];
                if(str2.startsWith(str1) && str2.endsWith(str1)) cnt++;
            }
        }
        return cnt;
    }
}