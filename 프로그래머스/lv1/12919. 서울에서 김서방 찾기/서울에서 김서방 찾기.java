class Solution {
    public String solution(String[] seoul) {
        int index = 0;
        
        int len = seoul.length;
        for(int i = 0; i < len; i++) {
            if(seoul[i].equals("Kim")) {
                index = i;
            }
        }
        return "김서방은 " + index +"에 있다";
    }
}