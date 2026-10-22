class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr = new String[n];
        int i = 0;
        for(int num : nums){
            arr[i] = ""+num;
            i++;
        }

        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }

        if(sb.charAt(0) == ('0')) return "0";
        return sb.toString();

    }
}