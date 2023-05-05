class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        s.chars().map(it -> {
            int temp = it + n;
            
            if(it >= 97) {
                if(temp > 122) {
                    return temp - 26;
                } else if(temp >= 97) {
                    return temp;
                }
            } else if(it >= 65) {
                if(temp > 90) {
                    return temp - 26;
                } else if(temp >= 65) {
                    return temp;
                } 
            }
             
            return it;
        }).forEach(it -> sb.append((char) it));
        
        return String.valueOf(sb);
    }
}