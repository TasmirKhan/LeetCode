class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            Stack<Integer> st = new Stack<>();
            while(num > 0){
                st.add(num%10);
                num/=10;
            }
            while(!st.isEmpty()){
                lst.add(st.pop());
            }
        }
        int[] arr = new int[lst.size()];
        for(int i = 0 ; i<lst.size() ; i++){
            arr[i] = lst.get(i);
        }
        return arr;
    }
}