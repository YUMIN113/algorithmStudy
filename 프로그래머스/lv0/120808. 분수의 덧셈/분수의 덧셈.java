class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int lcm = (denom1 * denom2) / gcd(denom1, denom2);
        
        numer1 = numer1 * (lcm / denom1);
        numer2 = numer2 * (lcm / denom2);
        
        int numer = numer1 + numer2;
        int denom = lcm;
        
        int gcd = gcd(numer, denom);
        
        if(gcd != 1) {
            numer = numer / gcd;
            denom = denom / gcd;
        }
        
        int[] answer = {numer, denom};
        return answer;
    }
    
    private int gcd(int a, int b) {
        
        while(b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}