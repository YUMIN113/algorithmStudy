import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    int[] alphabet = new int[26];
    int[] result = new int[26];


    for(int i = 0; i < 26; i++) {
      alphabet[i] = 97 + i;
    }

    for(int i = 0; i < 26; i++) {
      result[i] = -1;
    }

    for(int i = 0; i < str.length(); i++) {
      int s = str.charAt(i);

      for(int j = 0; j < 26; j++) {

        if(s == alphabet[j]) {
          if(result[j] == -1) {
            result[j] = i;
          }
        }
      }
    }
    for(int answer : result) {
      System.out.print(answer + " ");
    }
  }
}