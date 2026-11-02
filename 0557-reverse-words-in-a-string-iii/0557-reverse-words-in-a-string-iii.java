class Solution {
    public static String revString(String str){
        char[] arr = str.toCharArray();
        int low = 0, high = str.length() -1;
        while(low <= high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++; high--;
        }
        return new String(arr);
    }

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){

            String str = arr[i];
            arr[i] = revString(str);
        }

        return String.join(" ",arr);

        
    }
}