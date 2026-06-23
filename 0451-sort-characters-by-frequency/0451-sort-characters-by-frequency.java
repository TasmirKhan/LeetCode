class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[128];
        int cnt = 0 ;
        for(char x : s.toCharArray()){
            arr[x] += 1;
            cnt = Math.max(arr[x],cnt);
        }

        StringBuilder sb = new StringBuilder();
        while(cnt > 0){
            
            for(int i = 0 ; i < arr.length ; i++){
                int temp = cnt;
                if(arr[i] == temp){
                    for(int j = 0 ; j<temp ; j++){
                        sb.append((char)i);
                    }
                }
            }
            cnt-=1;
        }
        return sb.toString();
    }
}