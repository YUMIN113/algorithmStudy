import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        answer = Arrays.stream(arr).filter(it -> it % divisor == 0).toArray();
        
        if(answer.length != 0) {
            Arrays.sort(answer);
        } else {
            answer = new int[]{-1};
        }
        
        return answer;
    }
}