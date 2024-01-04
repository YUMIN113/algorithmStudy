import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        if (n <= 3) {
            return answer = 1;
        }
        
        while (n / 3 > 0) {
            list.add(n % 3);
            n = n / 3;
            if (n < 3) {
                list.add(n);
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(3, ((list.size() - 1) - i));
        }
        return answer;
    }
}