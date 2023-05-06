class Solution {
    boolean solution(String s) {
      
        int countP = 0;
        int countY = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p') {
                countP++;
            } else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y') {
                countY++;
            }
        }

        return (countP == countY) ? true : false;
    }
}

// 다른 사람의 풀이
// count++ 와 count-- 로 코드 작성
// class Solution {
//     boolean solution(String s) {
//         int count = 0;
//         s = s.toUpperCase();
        
//         for(int i = 0; i < s.length(); i++) {
//             if(s.charAt(i) == 'P') {
//                 count++;
//             } else if(s.charAt(i) == 'Y') {
//                 count--;
//             }
//         }
//         return (count == 0) ? true : false;
//     }
// }

// 다른 풀이
// class Solution {
//     boolean solution(String s) {
        
//         s = s.toUpperCase();
//         return s.chars().filter(it -> it == 'P').count() == s.chars().filter(it -> it == 'Y').count();
        
//     }
// }