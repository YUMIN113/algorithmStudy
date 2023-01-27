import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine().toUpperCase();

    ArrayList<String> list = new ArrayList<>();
    for(int i = 0; i < str.length(); i++) {
      list.add(String.valueOf(str.charAt(i)));
    }

    Map<String, Integer> map = new HashMap<String, Integer>();
    for(String alphabet : list) {
      Integer count = map.get(alphabet);
      if(count == null) {
        map.put(alphabet, 1);  
      } else {
        map.put(alphabet, count + 1);
      }
    }

    Integer maxValue = Collections.max(map.values());


    ArrayList<String> keyList = new ArrayList<>();
    map.forEach((key, value) -> {
      if(value.equals(maxValue)) {
        keyList.add(key);
      };
    });

    if(keyList.size() == 1) {
      for(String key : keyList) {
        System.out.println(key);
      }
    } else {
      System.out.println('?');
    }
  }
}