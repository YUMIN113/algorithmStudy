class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String value = String.valueOf(num);
        
        for(int i = 0; i < value.length(); i++) {
            
            if(value.charAt(i) == 48 + k) {
                return answer = i + 1;
            }
        }
        return -1;
    }
}