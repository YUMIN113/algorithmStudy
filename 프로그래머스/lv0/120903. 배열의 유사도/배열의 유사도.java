import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Map<String, String> map = new HashMap<>();
        
        for(int i = 0; i < s1.length; i++) {
            map.put(s1[i], s1[i]);
        }
        
        for(int i = 0; i < s2.length; i++) {
            if(map.containsKey(s2[i])) {
                answer++;
            }
        }
        return answer;
    }
}