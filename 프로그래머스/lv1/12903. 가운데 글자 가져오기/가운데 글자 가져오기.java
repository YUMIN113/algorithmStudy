class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        if(s.length() % 2 == 0) {
            for(int i = (s.length() / 2) - 1; i <= (s.length() / 2); i++) {
                sb.append(s.charAt(i));
            } 
        } else {
              sb.append(s.charAt(s.length() / 2));
          }
        return String.valueOf(sb);
    }
}