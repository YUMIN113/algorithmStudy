import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Long multiplyResult = 1L;

    for(int i = 0; i < 3; i++) {
      Long num = Long.parseLong(br.readLine());
      multiplyResult *= num;
    }

    String str = Long.toString(multiplyResult);

    int[] arr = new int[10];
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < str.length(); j++) {
        if(i == str.charAt(j) - 48) {
          arr[i] ++;
        } 
      }
    }

    for(int result : arr) {
      System.out.println(result);
    }
  }
}
