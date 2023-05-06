import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
       
        return IntStream.range(2, n).filter(it -> n % it == 1).findFirst().getAsInt();
        
    }
}