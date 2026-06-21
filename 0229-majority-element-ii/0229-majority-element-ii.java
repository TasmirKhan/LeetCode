class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> lst = new ArrayList<>();
        // int x = nums.length; 
        // int n = nums.length/3;
        // for(int i=0;i<x;i++){
        //     int cnt =0;
        //     for(int j =0;j<x;j++){
        //         if(nums[i] == nums[j]){ cnt++;}
        //     }
        //     if(cnt>(n)){if(!lst.contains(nums[i])){lst.add(nums[i]);}}
        //     else{continue;}
        // }
        // return lst;

        // HashMap<Integer,Integer> map = new HashMap<>();
        // int n= nums.length/3;
        // for(int n1:nums){
        //     map.put(n1,map.getOrDefault(n1,0)+1);
        // }

        // for(int key : map.keySet()){
        //     if(map.get(key)>(nums.length/3)){
        //         lst.add(key);
        //     }
        // }

        //Booyer Moore's Voting Algorithm
        int candidate1 =0, candidate2=0,count1=0,count2=0;
        for(int num :nums){
            if(candidate1==num){count1++;}
            else if(candidate2==num){count2++;}
            else if(count1==0){candidate1 = num;count1=1;}
            else if(count2==0){candidate2 = num;count2 =1;}
            else{count1--;count2--;}
        }

        count1=count2=0;
        //verifying 
        for(int num: nums){
            if(candidate1==num){count1++;}
            else if(candidate2 == num){count2++;}
        }

        if(count1>(nums.length/3)){lst.add(candidate1);}
        if(count2>(nums.length/3)){lst.add(candidate2);}
        return lst;
    }
}