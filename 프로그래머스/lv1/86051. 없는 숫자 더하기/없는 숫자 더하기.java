// class Solution {
//     public int solution(int[] numbers) {
//         int sum = 0;
//         int totalSum = ((1 + 9) * 9) / 2;
        
//         for(int i = 0; i < numbers.length; i++) {
//             sum += numbers[i];
//         }
//         return totalSum - sum;
//     }
// }

// 다른 방법

class Solution {
    public int solution(int[] numbers) {
        int sum = ((1 + 9) * 9) / 2;
       
        for(int value : numbers) {
            sum -= value;
        }
        return sum;
    }
}