class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] temp = new int[m+n];
        int i = m-1 , j =n-1, k=m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--] = nums1[i];
                i--;
            }
            else {
                nums1[k--] = nums2[j];
                j--;
            }
        }
        
        
        while(j>=0){nums1[k--] = nums2[j--] ; }
        
        // for(int l= 0 ; l<temp.length ; l++){
        //     nums1[l] = temp[l];
        // }


    }
}