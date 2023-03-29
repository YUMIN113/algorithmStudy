import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int count = 0;
        int[] countArray = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        
        int max = Arrays.stream(countArray).max().orElse(0);
        
        for(int i = 0; i < countArray.length; i++) {
            if(countArray[i] == max) {
                count++;
                answer = i;
            }
        }
        if(count == 1) {
            return answer;
        } else {
            return -1;
        }
    }
}