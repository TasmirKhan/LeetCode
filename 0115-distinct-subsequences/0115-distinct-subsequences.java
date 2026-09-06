class Solution {
    public int numDistinct(String s, String t) {
        return generate(s,t);
    }
    // 1. Optimal 2D Dp (n*m)
    public static int generate(String s , String t){
        int n = s.length();
        int m = t.length();
        int[][] dp= new int[n+1][m+1];

        for(int i = 0 ; i<dp.length ; i++){
            dp[i][0] = 1;
        }

        for(int i = 1 ; i<=n ; i++){
            for(int j = 1; j<=m; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
                else{ dp[i][j] = dp[i-1][j]; }
            }
        }

    return dp[n][m];

    }



    // 2. Better Brute (2^n)

    // public static int generate(int i , int j , String s, String t){
    //     if(j == t.length()) return 1;
    //     if(i == s.length()) return 0;

    //     if(s.charAt(i) == t.charAt(j)){
    //         return generate(i+1,j+1,s,t) + generate(i+1,j,s,t);
    //     }

    //     return generate(i+1,j,s,t);
    // }




    // 3. Brute Force (Generate all subsequences 2^n*n)

    // public static int generate(int idx, String s, String t, StringBuilder current){
    //     if(idx == s.length()){
    //         return current.toString().equals(t) ? 1 : 0;
    //     } 

    //     int notTake = generate(idx+1, s, t, current);

    //     current.append(s.charAt(idx));

    //     int take = generate(idx+1, s, t, current);

    //     current.deleteCharAt(current.length() - 1);

    //     return take + notTake;
    // }
}