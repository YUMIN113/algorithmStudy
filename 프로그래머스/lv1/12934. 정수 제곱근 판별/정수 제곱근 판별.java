class Solution {
    public long solution(long n) {
        long x = (long) Math.sqrt(n);
        long squareNum = (long) Math.pow(x, 2);
        
        return (squareNum == n) ? (long) Math.pow((x + 1), 2) : -1;
    }
}

