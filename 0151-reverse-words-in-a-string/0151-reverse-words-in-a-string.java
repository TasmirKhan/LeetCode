class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int high = arr.length - 1 , low = 0;
        while(low <= high){
            String temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp; 
            low++;
            high--;
        }

        return String.join(" ", arr);
    }
}