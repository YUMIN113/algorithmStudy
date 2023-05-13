// class Solution {
//     public int solution(int left, int right) {
//         int sum = 0;
        
//         for(int i = left; i <= right; i++) {
//             int square = (int) Math.sqrt(i);
//             int count = 0;
//             int totalCount = 0;
            
//             for(int j = 1; j <= square; j++) {
//                 if(i % j == 0) {
//                     count++;
//                 }
//             }
            
//             totalCount = count * 2;
            
//             if(Math.pow(square, 2) == i) {
//                 totalCount -= 1;
//                 sum -= i;
//                 continue;
//             }
//             sum += i;
//         }
//         return sum;
//     }
// }

// 개선
// 약수의 개수를 정확하게 계산할 필요 없음

class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        
        for(int i = left; i <= right; i++) {
            int square = (int) Math.sqrt(i);
            
            if(Math.pow(square, 2) == i) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }
}
