class Solution {
    public long solution(int a, int b) {
        
        int temp = 0;
        long sum = 0;
        
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        for(int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}