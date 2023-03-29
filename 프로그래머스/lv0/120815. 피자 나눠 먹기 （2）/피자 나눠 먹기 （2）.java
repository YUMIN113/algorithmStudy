class Solution {
    public int solution(int n) {
        final int SLICE = 6;
        
        return n / gcd(n, SLICE);
        
    }
    public int gcd(int n, int SLICE) {
        
        while(SLICE != 0) {
            int remainder = n % SLICE;
            n = SLICE;
            SLICE = remainder;
        }
        return n;
    }
}