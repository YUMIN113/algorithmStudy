import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        String answer = " ";
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<String> value = new LinkedHashSet<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            value.add(String.valueOf(my_string.charAt(i)));
        }
        
        value.forEach(a -> sb.append(a));
        answer = String.valueOf(sb);    
        
        return answer;
    }
}