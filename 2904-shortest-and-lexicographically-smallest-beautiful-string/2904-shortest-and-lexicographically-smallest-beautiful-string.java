class Solution {
      public static String lexSmall(String s, String t){
            return s.compareTo(t)<0 ? s : t;
        }
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int left = 0;
        int ones = 0;
        String res = "";

        for(int right = 0 ; right < n ; right++){
            if(s.charAt(right) == '1'){
                ones++;
           }

           while(ones > k){
           if(s.charAt(left) == '1'){
           ones-- ; 
           }
           left++;
           }

           if(ones == k){
              while (left <= right && s.charAt(left) == '0') {
                    left++;
                }

                  String temp = s.substring(left, right + 1);

                if (res.length() == 0 ||
                    temp.length() < res.length() ||
                    (temp.length() == res.length() &&
                     temp.compareTo(res) < 0)) {

                    res = temp;
                }
           }
        }
        return res;
    }
}