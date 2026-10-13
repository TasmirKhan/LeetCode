class Solution {
    public long maxAlternatingSum(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int n = nums.length;
        int k = n/2;

        for(int num : nums){
            if(num < 0){ num *= -1;}
            maxValue = Math.max(maxValue, num);
        }

        int[] freq = new int[maxValue+1];

        for(int num : nums){
            if(num < 0){ num *= -1;}
            freq[num]++;
        }


        int l = 0, r = maxValue;
        long sum = 0;
        while(r > l){
            while(r > l && freq[l] == 0){ l++;}
            while(r>l && freq[r] == 0){r--;}

            int cnt = Math.min(freq[l],freq[r]);

            freq[l] -= cnt;
            freq[r] -= cnt;

            long diff = r*r - l*l;
            sum += (diff*cnt);

        } 

        if((freq[r] & 1) != 0){
            sum += r*r;
        }
        else if((freq[l] & 1) != 0){
            sum += l*l;
        }
        return sum;


        // Sorting + Two Pointer Approach
        // int n = nums.length;
        // int k = n/2;

        // Arrays.sort(nums);

        // int i = 0 ;
        // int j = nums.length-1;
        // long sum = 0;

        // while(j-i >= k){
        //     if(Math.abs(nums[j]) > Math.abs(nums[i])){
        //         int x = Math.abs(nums[j--]);
        //         sum += x*x;
        //     }
        //     else{
        //         int y = Math.abs(nums[i++]);
        //         sum += y*y;
        //     }
        // }

        // while(i<=j){            
        //     sum -= (nums[i] * nums[i]);
        //     i++;
        // }
        // return sum ;



        // Priority Queue Approach
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // for(int num : nums){
        //     maxHeap.add(Math.abs(num));
        // }

        // int n = nums.length;
        // int k = Math.ceilDiv(n,2);
        // long sum = 0;
        // while(n>0){
        //     if(k>0){
        //         sum +=(long) Math.pow(maxHeap.poll(),2);
        //         k--;
        //     }
        //     else{
        //         sum -=(long) Math.pow(maxHeap.poll(), 2);
        //     }
        //     n--;
        // }

        // return sum;


    }
}