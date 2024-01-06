class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        answer.append(0);
        
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer.insert(0, i);
                answer.append(i);
            }
        }
        return String.valueOf(answer);
    }
}

// 다른 풀이
class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        
        answer.append(0);
        
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer.insert(0, i);
                answer.append(i);
            }
        }
        return String.valueOf(answer);
    }
}
