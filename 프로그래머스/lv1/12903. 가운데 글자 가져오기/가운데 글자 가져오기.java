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

// 다른 사람 풀이
// String.substring(int startIndex, int endIndex) 사용

// class Solution {
//     public String solution(String s) {
//         String answer = " ";
        
//         if(s.length() % 2 == 0) {
//             answer = s.substring(((s.length() / 2) - 1), ((s.length() / 2) + 1));
//         } else {
//             answer = s.substring((s.length() / 2), ((s.length() / 2) + 1));
//           }
//         return answer;
//     }
// }