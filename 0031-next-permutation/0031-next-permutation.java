class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseOrder(int[] arr, int i , int j ){
        while(i<=j){
           swap(arr,i,j);
           i++;
           j--;
        }
    }
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        for(int i = n-2 ; i>=0 ; i--){
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverseOrder(arr,0,n-1);
            return;
        }

        for(int i = n-1 ; i>index ; i--){
            if(arr[i] > arr[index]){
                swap(arr,i,index);
                break;
            }
        }
        reverseOrder(arr, index+1, n-1);
    }
}