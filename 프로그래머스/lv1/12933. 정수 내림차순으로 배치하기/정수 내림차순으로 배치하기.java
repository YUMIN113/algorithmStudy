import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String temp = "";
        for(String s : str) {
            temp += s;
        }
        return Long.parseLong(temp);
    }
}