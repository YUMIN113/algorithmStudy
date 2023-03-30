import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int) Math.sqrt(n);
        
        answer = (int) IntStream.rangeClosed(1, sqrt).filter(it -> n % it == 0).count();
        answer += answer;
        
        if(Math.sqrt(n) - sqrt == 0.0) {
            answer--;
        }
        return answer;
    }
}