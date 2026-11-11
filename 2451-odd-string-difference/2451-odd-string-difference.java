class Solution {
    public String oddString(String[] words) {
        int[] word1 = getDiff(words[0]);
        int[] word2 = getDiff(words[1]);
        int[] word3 = getDiff(words[2]);

        if(Arrays.equals(word1,word2)){
            for(int i = 2 ; i < words.length; i++){
                if(!Arrays.equals(word1, getDiff(words[i]))){
                    return words[i];
                }
            }
        }
        else if(Arrays.equals(word1, word3)){
            return words[1];
        }
        return words[0];
      
    }

    public static int[] getDiff(String s){
        int len = s.length();
        int[] arr = new int[len-1];
        for(int i = 1 ; i < len ; i++){
            arr[i-1] = s.charAt(i) - s.charAt(i-1);
        }
        return arr;
    }
}