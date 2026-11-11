class Solution {
    public long minimumCost(int c1, int c2, int cB, int n1, int n2) {

        // Using Built-in Math.min() method
        long res = 0;
        if(c1+c2 <= cB){
            return (1L*c1*n1 + 1L*c2*n2);
        }
        else{
            long min = Math.min(n1,n2);
            res = 1L*cB*min;

            n1 -= min;
            n2-= min;

            if(n1 > 0){
                res += 1L*n1*Math.min(cB,c1);
            }
            else if(n2 > 0){
                res += 1L*n2*Math.min(cB,c2);
            }
        }

        return res;

        // Using Scratch work;
        // if(n1 == 0 && n2 == 0) return 0;
        // long combinedCost = c1 + c2;
        // long sum = 0;
        // long cost1 = c1, cost2 = c2, costBoth = cB, need1 = n1, need2 = n2;

        // if(need1 == 0){
        //     if(cost2 < costBoth){
        //         return cost2*need2;
        //     }
        //     else{ return costBoth*need2; }
        // }

        // else if(need2 == 0){
        //     if(cost1 < costBoth){
        //         return cost1*need1;
        //     }
        //     else{return costBoth*need1; }
        // }

        // if(combinedCost < costBoth){
        //         return cost1*need1 + cost2*need2;
        // }
        
        // else{
        //     if(need1 < need2){
        //         sum += costBoth*need1;
        //         need2 -= need1;
        //         if(costBoth < cost2){
        //             sum+= costBoth*need2;
        //         }
        //         else{
        //             sum += cost2*need2;
        //         }
        //     }
        //     else{
        //          sum += costBoth*need2;
        //         need1 -= need2;
        //         if(costBoth < cost1){
        //             sum+= costBoth*need1;
        //         }
        //         else{
        //             sum += cost1*need1;
        //         }
        //     }
        // }

        // return sum;
    }
}