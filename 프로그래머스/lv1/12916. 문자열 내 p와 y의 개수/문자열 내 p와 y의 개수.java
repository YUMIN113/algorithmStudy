// class Solution {
//     boolean solution(String s) {
      
//         int countP = 0;
//         int countY = 0;
        
//         for(int i = 0; i < s.length(); i++) {
//             if(s.charAt(i) == 'P' || s.charAt(i) == 'p') {
//                 countP++;
//             } else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y') {
//                 countY++;
//             }
//         }

//         return (countP == countY) ? true : false;
//     }
// }


class Solution {
    boolean solution(String s) {
        
        int count = 0;
        s = s.toUpperCase();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'P') {
                count++;
            } else if(s.charAt(i) == 'Y') {
                count--;
            }
        }

        return (count == 0) ? true : false;
    }
}