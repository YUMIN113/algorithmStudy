class Solution {
    public int solution(int num) {
        
        int count = 0;
        long value = num;
        
        while(count < 500) {
            
            if(value == 1) {
                break;
            }
            
            if(value % 2 == 0) {
                value = value / 2;
                count++;
            } else {
                value = (value * 3) + 1;
                count++;
            }
            
            if(value == 1) {
                break;
            }
        }
        
        if(count >= 500 && value != 1) {
            count = -1;
        }
        return count;
    }
}