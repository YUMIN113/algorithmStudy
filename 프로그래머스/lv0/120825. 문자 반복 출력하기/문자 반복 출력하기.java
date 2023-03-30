class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int repeat = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            while(repeat != n) {
                sb.append(my_string.charAt(i));
                repeat++;
            }
            repeat = 0;
        }
        answer = String.valueOf(sb);
        return answer;
    }
}