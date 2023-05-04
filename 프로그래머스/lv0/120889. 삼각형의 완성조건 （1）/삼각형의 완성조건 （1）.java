import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().orElse(0);
        int sum = Arrays.stream(sides).sum() - max;
        return sum > max ? 1 : 2;
    }
}
