import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[10];


    for(int i = 0; i < 10; i++) {
      arr[i] = Integer.parseInt(br.readLine()) % 42;
    }

    ArrayList<Integer> list = new ArrayList<>();

    for(int result : arr) {
      if(!list.contains(result)) {
        list.add(result);
      }
    }

    System.out.print(list.size());

  }
}