class Solution {
    public int repeatedStringMatch(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int minCount=(blen + alen - 1)/alen;
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<minCount ; i++){
            sb.append(a);
        }

        if(rabinKarp(sb.toString(), b)){
            return minCount;
        }
        sb.append(a);

        if(rabinKarp(sb.toString(),b)){
            return minCount+1;
        }
        return -1;
    }

    private boolean rabinKarp(String text , String pattern){
        int n = text.length();
        int m = pattern.length();

        if(m>n){ return false; }

        long base = 31;
        long mod = 1000000000 + 7 ;

        long patternHash = 0 ;
        long windowHash = 0;
        long power = 1;

        //base^(m-1)
        for(int i = 0 ; i < m-1 ; i++){
            power = (power*base)%mod;
        }

        for(int i = 0 ; i<m ; i++){
            patternHash = (patternHash*base + pattern.charAt(i))%mod;
            windowHash = (windowHash*base + text.charAt(i))%mod;

        }

        if(patternHash == windowHash && text.regionMatches(0,pattern,0,m)){
            return true;
        }

        for(int i = m ; i<n ; i++){
            windowHash = (windowHash - text.charAt(i-m)*power%mod + mod)%mod;
            windowHash = (windowHash*base + text.charAt(i))%mod;

            int start = i-m+1;
            if(windowHash == patternHash && text.regionMatches(start, pattern , 0, m)){ return true;}
        }
        return false;
    }
}