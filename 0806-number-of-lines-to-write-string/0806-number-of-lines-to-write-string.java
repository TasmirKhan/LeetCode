class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int n = s.length();
        int i = 0;
        int newline = 0;
        int respx = 0;
        while(i < n){
            int px = 0;            
            StringBuilder sb = new StringBuilder();
            while( i < n && px < 100 ){
                char ch = s.charAt(i++);
                int currpx = widths[ch-'a'];
                if(px + currpx > 100){ i--; break;}
                px += currpx;
                sb.append(ch);
            }
            newline++;
            respx = px;
        }
        return new int[]{newline,respx};
    }
}