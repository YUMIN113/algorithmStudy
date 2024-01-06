class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        String temp = "";
        
        sb.append(0);
        for (int i = food.length - 1; i > 0; i--) {
            int count = food[i] / 2;
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }
        temp = String.valueOf(sb);
        
        for (int i = 1; i < temp.length(); i++) {
            sb.insert(0, temp.charAt(i));
        }
        return String.valueOf(sb);
    }
}