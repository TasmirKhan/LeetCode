class Solution{
    public int countPrimes(int n){
        if(n<=2) return 0;
        int count =0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2;i*i<n;i++){
            if(isPrime[i]){
                 for(int j = i*i;j<n;j+=i){
                    isPrime[j] = false;
                 }
            }
        }

        for(int i = 2;i<n;i++){
            if(isPrime[i]) count++;
        }

        return count;
    }
}

// class Solution {
//         // Modular multiplication to avoid overflow
//     private static long mulMod(long a, long b, long mod) {
//         long result = 0;
//         a %= mod;
//         while (b > 0) {
//             if ((b & 1) == 1) result = (result + a) % mod;
//             a = (a << 1) % mod;
//             b >>= 1;
//         }
//         return result;
//     }

//     // Modular exponentiation
//     private static long powMod(long base, long exp, long mod) {
//         long result = 1;
//         base %= mod;
//         while (exp > 0) {
//             if ((exp & 1) == 1)
//                 result = mulMod(result, base, mod);
//             base = mulMod(base, base, mod);
//             exp >>= 1;
//         }
//         return result;
//     }

//     // Miller–Rabin test for one base
//     private static boolean check(long a, long s, long d, long n) {
//         long x = powMod(a, d, n);
//         if (x == 1 || x == n - 1) return true;
//         for (int i = 1; i < s; i++) {
//             x = mulMod(x, x, n);
//             if (x == n - 1) return true;
//         }
//         return false;
//     }

//     // Deterministic for 64-bit
//     public static boolean isPrime(long n) {
//         if (n < 2) return false;
//         if (n % 2 == 0) return n == 2;
//         if (n % 3 == 0) return n == 3;

//         long d = n - 1;
//         long s = 0;
//         while ((d & 1) == 0) {
//             d >>= 1;
//             s++;
//         }

//         // Guaranteed bases for 64-bit safety
//         long[] bases = {2, 325, 9375, 28178, 450775, 9780504, 1795265022};

//         for (long a : bases) {
//             if (a % n == 0) continue;
//             if (!check(a, s, d, n)) return false;
//         }

//         return true;
//     }
//     public int countPrimes(int n) {
//         if(n<=1) return 0;
//         int count =0;
//         int i =0;
//         while(i<n){
//           if(isPrime(i)) count++;
//           i++;
//         }
//         return count;
//     }
// }