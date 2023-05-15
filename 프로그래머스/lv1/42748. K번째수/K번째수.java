import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            int startIndex = commands[i][0] - 1;
            int endIndex = commands[i][1] - 1;
            int targetIndex = commands[i][2] - 1;
            
            for(int j = startIndex; j <= endIndex; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            
            answer[i] = list.get(targetIndex);
            list.clear();
        }
        return answer;
    }
}