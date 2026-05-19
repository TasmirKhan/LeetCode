class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        ArrayList<Integer> lst = new ArrayList<>();

        int i = 0 , j = 0 ; 
        while(i<n1 && j < n2){
            if(nums1[i] == nums2[j]){
                lst.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){ i++ ; }

            else{ j++; }
        }

        int[] arr = new int[lst.size()];

        for(int x = 0; x<lst.size() ; x++){
            arr[x] = lst.get(x);
        }
        return arr;
       
    }
}