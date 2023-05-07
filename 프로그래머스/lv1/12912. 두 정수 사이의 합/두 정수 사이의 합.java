class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        
        long n = Math.abs(b - a) + 1;
        sum = ((a + b) * n) / 2;
        
        return sum;
    }
}

// class Solution {
//     public long solution(int a, int b) {
        
//         int temp = 0;
//         long sum = 0;
        
//         if (a > b) {
//             temp = a;
//             a = b;
//             b = temp;
//         }
        
//         for(int i = a; i <= b; i++) {
//             sum += i;
//         }
//         return sum;
//     }
// }