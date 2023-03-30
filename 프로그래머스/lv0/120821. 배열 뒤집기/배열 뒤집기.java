class Solution {
    public int[] solution(int[] num_list) {
        int arr_length = num_list.length;
        int[] answer = new int[arr_length];
        
        for(int i = arr_length - 1; i >= 0; i--) {
            answer[(arr_length - 1) - i] = num_list[i];
        }
        return answer;
    }
}