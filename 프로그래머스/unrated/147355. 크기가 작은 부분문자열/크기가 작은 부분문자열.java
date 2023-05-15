class Solution {
    public int solution(String t, String p) {
        int count = 0;
    
        for(int i = 0; i < (t.length() - (p.length() - 1)); i++) {
            Long temp = Long.parseLong(t.substring(i, i + p.length()));
            if(Long.parseLong(p) >= temp) {
                count++;
            }
        }
        return count;
    }
}