class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        rsp.chars().forEach(it -> {
            switch(it) {
                    case '2' -> sb.append('0');
                    case '0' -> sb.append('5');
                    case '5' -> sb.append('2');
            }
        });
        
        return String.valueOf(sb);
    }
    
}