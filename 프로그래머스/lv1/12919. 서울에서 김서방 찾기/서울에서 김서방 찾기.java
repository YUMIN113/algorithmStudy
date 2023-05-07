import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        
        int len = seoul.length;
        for(int i = 0; i < len; i++) {
            if(seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index +"에 있다";
    }
}

// 다른 사람 풀이
// 자바 배열에서는 indexOf() 지원하지 않는다.

// class Solution {
//     public String solution(String[] seoul) {
//         int index = Arrays.asList(seoul).indexOf("Kim");
//         return "김서방은 " + index +"에 있다";
//     }
// }