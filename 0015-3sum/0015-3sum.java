class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        ArrayList<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0 ; i<arr.length ; i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            int left = i+1, right = arr.length-1;
            while(left < right){
                int sum = arr[i]+arr[left]+arr[right];

                if(sum == 0 ){
                    List<Integer> temp = Arrays.asList(arr[i],arr[left],arr[right]);
                    lst.add(temp);
                    left++; right--;
                    while(left<right && arr[left] == arr[left-1]) left++;
                    while(left<right && arr[right] == arr[right+1]) right--;
                    
                }

                else if(sum<0)left++;
                else{right--;}

            }
        }
        return lst;
        // HashSet<List<Integer>> lst = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int j=i+1;j<nums.length;j++){
               
        //         if(set.contains(-(nums[i]+nums[j]))){
        //             List<Integer> arrlst = Arrays.asList(nums[i], nums[j], -(nums[i]+nums[j]));
        //             Collections.sort(arrlst);
        //             lst.add(arrlst);
        //         }
        //         set.add(nums[j]);
                
        //     }
        // }
        // return new ArrayList<>(lst);
    }
}