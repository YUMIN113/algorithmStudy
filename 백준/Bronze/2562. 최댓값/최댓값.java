import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int[] num = new int[9];
    int[] numLine = new int[9];

    int result = 0;
    int line = 0;

    for(int i = 0; i < 9; i++) {
      num[i] = Integer.parseInt(br.readLine());
      numLine[i] = num[i];
    }

    for(int i = 0; i < 8; i++) {
      if(num[i] > num[i + 1] || num[i] == num[i + 1]) {
        num[i + 1] = num[i];
        result = num[i + 1];
      }

      if(num[i] < num[i + 1]) {
        num[i] = num[i + 1];
        result = num[i];
      } 
    }

    for(int i = 0; i < 9; i ++) {
      if(numLine[i] == result) {
        line = i + 1;
      }
    }

    sb.append(result + "\n" + line);
    System.out.print(sb);

  }
}
