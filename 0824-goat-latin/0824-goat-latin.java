class Solution {
    public static String process(String s){
        char temp = s.charAt(0);
        String vowels = "aeiouAEIOU";
        if(vowels.indexOf(temp) != -1){
            return s+"ma";
        }
        else{
            String s2 = s.substring(1,s.length());
            return s2 + temp + "ma" ;
        }

    }

    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
           String temp = process(arr[i]);
           String x = "a";
           arr[i] = temp + x.repeat(i+1);
        }

        return String.join(" ", arr);
    }
}