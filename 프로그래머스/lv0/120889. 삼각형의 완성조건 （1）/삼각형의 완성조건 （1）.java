import java.util.*;

class Solution {
    public int solution(int[] sides) {
        
        int max = Arrays.stream(sides).max().orElse(0);
        int sum = Arrays.stream(sides).sum() - max;
        
        if(sum > max) {
            return 1;
        }
        return 2;
    }
}