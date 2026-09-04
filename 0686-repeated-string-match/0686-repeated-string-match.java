class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder aa = new StringBuilder();
        int count = 0;
        while(aa.length() < b.length()){
            aa.append(a);
            count++;
        }
        if(aa.toString().contains(b)){ return count; }

        aa.append(a);
        count++;

        if(aa.toString().contains(b)){return count; }

        return -1;
    }
}