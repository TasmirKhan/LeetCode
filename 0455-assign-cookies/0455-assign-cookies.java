class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int m = g.length;
        int n = s.length;

        int i = 0; 
        int j = 0;
        int cnt = 0;

        while(i < m && j<n){
            while(j < n && s[j] < g[i]){ j++; }
            if(j < n && s[j] >= g[i]){
                cnt++; i++; j++;
            }
        }

        return cnt;
    }
}