class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int i = 0;
        int j = s.length()-1;
        String[] arr = s.split("");        

        while(i < j){
            while(i < j && !vowels.contains(arr[i])){ i++; }
            while(i < j && !vowels.contains(arr[j])){ j--; }

            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();
        for(int x = 0 ; x < arr.length ; x++){
            sb.append(arr[x]);
        }

        return sb.toString();

    }
}