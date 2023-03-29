import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = IntStream.rangeClosed(1, n).filter(it -> it % 2 != 0).toArray();
        return answer;
    }
}