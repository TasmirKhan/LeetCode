class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        int i = 0, j = arr.length - 1;

        while(i < j){
            // while(i<j && arr[i].equals(" "))i++;
            // while(i<j && arr[j].equals(" "))j--;

            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }

        return String.join(" ", arr);
    }
}