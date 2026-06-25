class Solution {
    public int beautySum(String s) {
        int n = s.length();
        
        int sum = 0;
        
        for(int i = 0 ; i<n ; i++){
            for(int j = i ; j<n ; j++){
                int [] arr = new int[26];
                int max = 0, min = Integer.MAX_VALUE;
                for(int k = i ; k<=j ; k++){
                    arr[s.charAt(k) - 'a']++;
                }
                for(int x : arr){
                    if(x>0){
                        max = Math.max(max,x);
                        min = Math.min(min,x);
                    }
                }

                 sum += (max-min);
            }
           
        }
        return sum;
    }
}