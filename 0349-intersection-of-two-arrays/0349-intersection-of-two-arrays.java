class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        Set<Integer> lst = new HashSet<>();
        
        for(int num : nums2){
            if(set.contains(num)) lst.add(num);
        }
        int[] arr = new int[lst.size()];
        int index = 0;
        for(int i : lst){
            arr[index++] = i;
        }
        return arr;
    }
}