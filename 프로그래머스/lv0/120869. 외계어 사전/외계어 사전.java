class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        boolean check = false;

        for (int i = 0; i < dic.length; i++) {
            if (dic[i].length() != spell.length) {
                continue;
            } else {
                for (int j = 0; j < spell.length; j++) {
                    if(dic[i].contains(spell[j])) {
                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                    }
                if (check) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}