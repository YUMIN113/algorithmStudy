import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        List<Long> list = new ArrayList<>();
        
        while(n != 0) {
            list.add(n % 10);
            n = n / 10;
        }
        return list.stream().mapToInt(Long::intValue).toArray();
    }
}