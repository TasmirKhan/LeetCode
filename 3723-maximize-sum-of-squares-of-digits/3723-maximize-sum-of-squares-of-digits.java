class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // If even all 9s cannot reach the required sum, it's impossible
        if (sum > 9 * num) {
            return "";
        }
        
        StringBuilder ans = new StringBuilder();
        int nines = sum / 9;
        int remainder = sum % 9;
        
        // Append all 9s
        for (int i = 0; i < nines; i++) {
            ans.append('9');
        }
        
        // Append the single non-zero remainder digit if it exists
        if (remainder > 0) {
            ans.append((char) ('0' + remainder));
        }
        
        // Fill the remaining positions with zeros
        int zeros = num - ans.length();
        for (int i = 0; i < zeros; i++) {
            ans.append('0');
        }
        
        return ans.toString();
    }
}

// class Solution {
//     public String maxSumOfSquares(int num, int sum) {
//         StringBuilder res = new StringBuilder();
//         int sum2 = sum;
        
//         int[] arr = new int[10];
//         int i = 9 ;
//         int total = 0;
//         while(i>=1){
//             arr[i] = sum/i;
//             total += arr[i];
//             sum %=i;
//             i--;
//         }

//         if(total > num) return "";
//         int j = 9;
//         while(j > 0){
//             while(arr[j] > 0){
//                 res.append();
//                 arr[j]--;
//             }
//             j--;
//         }

//         int x = num - total;
//         if( x == 0 ) return res.toString();

//         while(x > 0){
//             res.append('0');
//             x--;
//         }
//         return res.toString();


//         // while(num > 0){
//         //     if(sum <= 9 && sum > 0){
//         //         res += sum;
//         //         sum -= sum;
//         //     }
//         //     else if(sum <= 0){
//         //         res += "0";
//         //     }
//         //     else{
//         //         res += "9";
//         //         sum -= 9;
//         //     }
//         //     num--;
//         // }

//         // if(sum == 0) return res;
//         // return "";
        
       
//     }
// }