import java.util.stream.LongStream;

class Solution {
    public long[] solution(int x, int n) {
        return LongStream.rangeClosed(1, n).map(it -> x * it).toArray();
    }
}

// class Solution {
//     public long[] solution(int x, int n) {
//         long[] answer = new long[n];
        
//         for(int i = 1; i <= n; i++) {
//             answer[i - 1] = x * i;
//         }
//         return answer;
//     }
// }