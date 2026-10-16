class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int limit = n/2;

        Set<Integer> st = new HashSet<>();
        for(int num : candyType){
            st.add(num);
        }

        return Math.min(limit, st.size());

    }
}