import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int num11 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        
        return num11 > num2 ? num11 : num2;
        
    }
}