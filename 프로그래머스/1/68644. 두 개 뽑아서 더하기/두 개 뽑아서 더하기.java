import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers) {
        Integer[] temp = new Integer[201];
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (temp[sum] == null) {
                    temp[sum] = sum;
                }
            }
        }
        
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}