class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n = a.length(); 
        int m = b.length();
        int cnt = 0;
        String res = "";
       
        while(res.length() < b.length()){
            res += a; cnt++;
            if(res.contains(b))return cnt;
            
        }
        
        res += a;
        cnt+= 1;
        if(res.contains(b)) return cnt;

        return -1;
    }
}