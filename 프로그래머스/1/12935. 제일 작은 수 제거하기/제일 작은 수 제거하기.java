import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        if (arr.length == 1) {
            answer[0] = -1;
            return answer;
        }

        Arrays.sort(arr);
        return Arrays.stream(answer).filter(value -> value != arr[0]).toArray();

    }
}