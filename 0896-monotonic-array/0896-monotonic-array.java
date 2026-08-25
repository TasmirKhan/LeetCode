class Solution {
    public boolean isMonotonic(int[] arr) {
     int n = arr.length;
     if(n<=1) return true;
     boolean inc = false;
     int x = arr[n-1] - arr[0];
    if(x>0) inc = true;
    
    if(inc == true){
        for(int i = 1 ; i<n ; i++){
            if(arr[i] - arr[i-1] < 0 ) return false;
        }
    }
    else {
        for(int i = 1 ; i<n ; i++){
            if(arr[i] - arr[i-1] > 0) return false;
        }
    }
    return true;
    }
}