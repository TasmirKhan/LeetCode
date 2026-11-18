class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        String[] arr = s.split("\\s+");
        int i = 0, j = arr.length - 1;
        while(i < j){
            // while(left < right && arr[left].equals(" ")){left++;}
            // while(left < right && arr[right].equals(" ")){right--;}

            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }

        return String.join(" ", arr);
    }
}