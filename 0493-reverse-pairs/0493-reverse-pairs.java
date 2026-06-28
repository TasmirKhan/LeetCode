class Solution {
    public int reversePairs(int[] nums) {
       return mergeSort(nums, 0, nums.length-1);
    }

    public static int mergeSort(int[] arr, int low, int high){
        int mid = low + (high-low)/2;
        int count = 0 ;
        if(low >= high) return 0;
        count += mergeSort(arr,low, mid);
        count += mergeSort(arr,mid+1, high);

        count += countPairs(arr,low, mid, high);

        merge(arr,low,mid,high);        

        return count;
    }

    public static int countPairs(int[] arr, int low, int mid, int high){
        int count = 0 ;
        int right = mid+1;
        if(low >= right) return 0;

        for(int left = low ; left <=mid ; left++){
            while(right <= high && arr[left] > 2L*arr[right] ){
                right++;
            }
            count += right - (mid+1);
        }
        return count;
    }

    public static void merge(int[] arr,int low,int mid,int high){
        int left = low;
        int right = mid +1;
        int[] temp = new int[high - low + 1];
        int idx = 0;

        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[idx++] = arr[left++];
            }
            else{
                temp[idx++] = arr[right++];
            }
        }

        while(left<=mid){ temp[idx++] = arr[left++];}
        while(right <= high){ temp[idx++] = arr[right++]; }

        for(int i = 0 ; i<temp.length ; i++ ){
            arr[low+i] = temp[i]; 
        }
    }
}