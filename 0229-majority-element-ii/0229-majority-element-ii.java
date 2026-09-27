class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Optimal approach (Booyer Moore's Voting Algorithm)
        int cnd1 = 0, cnd2 = 0, cnt1 = 0, cnt2 = 0, n = nums.length;

        for(int num : nums){
            if(num == cnd1){cnt1++;}
            else if(num == cnd2){cnt2++;}
            else if(cnt1 == 0){ cnd1 = num; cnt1++;}
            else if(cnt2 == 0){ cnd2 = num; cnt2++;}
            else{cnt1--; cnt2--;}
        }

        //verifying
        cnt1 = 0 ; cnt2 = 0;
        
        List<Integer> lst = new ArrayList<>();
        for(int num : nums){
            if(num == cnd1){cnt1++;}
            else if(num == cnd2){cnt2++;}
        }
        
        if(cnt1 > n/3){lst.add(cnd1) ;}
        if(cnt2 > n/3){lst.add(cnd2) ;}

        return lst;


        // Better but not Optimal

        // Map<Integer,Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }

        // List<Integer> lst = new ArrayList<>();
        // int n = nums.length;
        // for(int x : map.keySet()){
        //     if(map.get(x) > (n/3)){
        //         lst.add(x);
        //     }
        // }
        // return lst;
    }
}