import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        
        Map<Integer, Integer> map = new HashMap<>();
        Integer maxKey = 0;

            Arrays.stream(array).forEach(it -> {
                if (map.containsKey(it)) {
                    int count = map.get(it);
                    map.put(it, ++count);
                    return;
                }
                map.put(it, 1);
            });

            Integer maxValue = map.values().stream().mapToInt(it -> it).max().getAsInt();

            List<Integer> tempList = map
                    .keySet()
                    .stream()
                    .filter(it -> map.get(it) == maxValue)
                    .collect(Collectors.toList());

            return tempList.size() == 1 ? tempList.stream().findFirst().get() : -1;
    }
}