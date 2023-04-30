import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {

        return my_string.chars().map(it -> Character.isUpperCase(it) ? Character.toLowerCase(it) : it).sorted().mapToObj(it -> String.valueOf((char) it)).collect(Collectors.joining());

    }
}