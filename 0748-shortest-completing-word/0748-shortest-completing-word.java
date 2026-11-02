class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String s = licensePlate.toLowerCase();
        int[] arr = new int[26];
        int[] temp = new int[26];

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                int x = c - 'a';
                arr[x]++;
                temp[x]++;
            }
        }

        Arrays.sort(words, Comparator.comparingInt(String::length));

        for(String word : words){
            for(char c : word.toCharArray()){
                temp[c - 'a']--;
            }
            boolean found = true;
            for(int a : temp){
                if(a > 0){
                  found = false;
                  break;
                }
            }
            if(!found){
                  for(int i = 0 ; i < 26 ; i++){
                        temp[i] = arr[i];
                    }
            }
            if(found) return word;
        }
        return " ";
    }
}