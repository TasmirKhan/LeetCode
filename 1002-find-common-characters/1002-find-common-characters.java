class Solution {
    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];
        Arrays.fill(freq, Integer.MAX_VALUE);

        for(String word : words){
            int[] map = new int[26];
            for(char c : word.toCharArray()){
                map[c-'a']++;
            }
            for(int i = 0 ; i < 26 ; i++){
                freq[i] = Math.min(freq[i], map[i]);
            }
        }

        List<String> lst = new ArrayList<>();
        for(int i = 0 ; i < 26 ; i++){
            while(freq[i] > 0){
                char temp = (char) ('a'+i);
                lst.add(String.valueOf(temp));
                freq[i]--;
            }
        }

        return lst;


    }
}