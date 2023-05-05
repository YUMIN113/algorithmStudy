import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int squareRoot = (int) Math.sqrt(n);
        
        return IntStream.rangeClosed(1, squareRoot)
                    .filter(it -> n % it == 0)
                    .map(it -> {
                        if(it == n / it) {
                            return it;
                        }
                        return it + (n / it);
                    }).reduce(0, (x, y) -> x + y);
    }
}