class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int i = 0 , j = n-1;
        long fix = skill[i] + skill[j];
        long sum = 0;
        while(i < j){
            long curr = skill[i] + skill[j];
            if(curr != fix) return -1;
            sum += skill[i]*skill[j];
            i++; j--;
        }
        return sum;
    }
}