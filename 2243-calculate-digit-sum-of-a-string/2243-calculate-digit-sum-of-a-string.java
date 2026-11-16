class Solution {
    public String digitSum(String s, int k) {
        // int n = s.length();
        while(s.length() > k){
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while(i < s.length()){
                int left = i;
                int right = i + k;
                int sum = 0;

                while(left < s.length() && left < right){
                     int x =  s.charAt(left) - '0';
                     sum += x;
                     left++;
                }
                sb.append(sum);
                i = right;
            }
            s = sb.toString();
        }
        return s;
    }
}