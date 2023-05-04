class Solution {
    public int solution(int order) {
        
            return (int) String.valueOf(order).chars().filter(it -> it == '3' || it == '6' || it == '9').count();
      
    }
}