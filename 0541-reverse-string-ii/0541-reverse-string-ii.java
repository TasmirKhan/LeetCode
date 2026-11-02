class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = s.length();

        for(int i = 0 ; i < n ; i += 2*k){
            int low = i;
            int high = Math.min(low+k-1, n-1);

            while(low <= high){
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++ ; high--;
            }
        }

        return new String(arr);
    }
}