class Solution {
    public int solution(int[] numbers) {
    
        int sum = 0;
        int totalSum = ((1 + 9) * 9) / 2;
        
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return totalSum - sum;
    }
}