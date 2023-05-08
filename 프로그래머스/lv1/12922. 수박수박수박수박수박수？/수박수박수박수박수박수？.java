import java.util.stream.*;

// class Solution {
//     public String solution(int n) {
//         StringBuilder sb = new StringBuilder();
        
//         for(int i = 1; i <= n; i++) {
//             sb.append((i % 2 == 0) ? "박" : "수");
//         }
//         return String.valueOf(sb);
//     }
// }

class Solution {
    public String solution(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(it -> {
            return (it % 2 == 0) ? "박" : "수";
        }).collect(Collectors.joining());
    }
}