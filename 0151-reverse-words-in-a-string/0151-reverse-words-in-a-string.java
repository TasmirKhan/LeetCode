class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        int n = arr.length;
        int low = 0 , high = n-1;
        while(low <= high){
            String temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
            low++;
        }
        StringBuilder sb = new StringBuilder();
        for(String st : arr){
            sb.append(st);
            sb.append(" ");
        }
        s = sb.toString();
        return s.trim();

    }
}